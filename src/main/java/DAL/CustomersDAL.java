/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entity.Category;
import Entity.Customers;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author kusod
 */
public class CustomersDAL {
    Session session;
    public CustomersDAL(){
        session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
    }

    public List loadCustomer(){
        Query query = session.createQuery("from Customers", Customers.class);
        List<Customers> customers = query.list();
        return customers;
    }
    
    public void addCustomer(Customers c) {
        session.beginTransaction();
        session.persist(c);
        session.getTransaction().commit();
    }

    public void updateCustomer(Customers c) {
        session.beginTransaction();
        session.merge(c);
        session.getTransaction().commit();
    }

    public void deleteCustomer(Customers c) {
        session.beginTransaction();
        session.remove(c);
        session.getTransaction().commit();
    }
    
    public List searchCustomer(String name) {
        List list;
        Query q = session.createQuery("FROM Customers WHERE Fullname LIKE CONCAT('%',:name,'%')");
        q.setParameter("name", name);
        list = q.list();
        return list;
    }
    
    public Customers getCustomer(int Id){
        Customers c = session.get(Customers.class, Id);
        return c;
    }
}
