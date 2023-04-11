package DAL;

import Entity.Vegetable;
import Util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.resource.transaction.spi.TransactionStatus;

public class ImportProductDAL {

    Session session;

    public ImportProductDAL() {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    public ArrayList productList() {
        Query query = session.createQuery("from Vegetable", Vegetable.class);
        ArrayList<Vegetable> vegetables = (ArrayList<Vegetable>) query.list();
        return vegetables;
    }

    public boolean Import(Vegetable v) {
        session.persist(v);
        session.getTransaction().commit();
        return session.getTransaction().getStatus() == TransactionStatus.COMMITTED;
    }

    public Vegetable GetProduct(int Id) {
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
