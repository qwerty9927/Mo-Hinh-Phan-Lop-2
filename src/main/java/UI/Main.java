package UI;

import DAL.CategoryDAL;
import Entity.Category;
import Entity.Vegetable;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        CategoryDAL cDAL = new CategoryDAL();
//        cDAL.loadCategory().forEach(element -> System.out.println(element)); // San pham cua cac danh muc tuong ung
        cDAL.getCategory(2).getVegetables().forEach(element -> System.out.println(element)); // San pham cua danh muc duoc chi dinh


//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        List<Category> categories = session.createQuery("from Category", Category.class).list();
//        categories.forEach(element -> {
//            System.out.println(element);
//            element.getVegetables().forEach(vegetable -> {
//                System.out.println(vegetable);
//            });
//            System.out.println();
//        });
//        List<Vegetable> vegetables = session.createQuery("from Vegetable", Vegetable.class).list();
//        vegetables.forEach(element -> {
//            System.out.println(element);
//        });
    }
}