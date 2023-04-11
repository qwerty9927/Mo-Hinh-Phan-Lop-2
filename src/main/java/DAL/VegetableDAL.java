package DAL;

import Entity.Vegetable;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;

public class VegetableDAL {

    Session session;

    public VegetableDAL() {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    public List loadVegetable() {
        Query query = session.createQuery("from Vegetable", Vegetable.class);
        List<Vegetable> vegetables = query.list();
        return vegetables;
    }

    public boolean addVegetable(Vegetable v) {
        session.persist(v);
        session.getTransaction().commit();
        return session.getTransaction().getStatus() == TransactionStatus.COMMITTED;
    }

    public void updateVegetable(Vegetable v) {
        session.merge(v);
        session.getTransaction().commit();
    }

    public void deleteVegetable(Vegetable v) {
        session.remove(v);
        session.getTransaction().commit();
    }

    public Vegetable getVegetable(int Id) {
        Vegetable v = session.get(Vegetable.class, Id);
        return v;
    }
}

/*
 * @author KhanhPham
 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
