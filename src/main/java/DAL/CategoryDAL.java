package DAL;

import Entity.Category;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CategoryDAL {
    Session session;
    public CategoryDAL(){
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    public List<Category> loadCategory(){
        return session.createQuery("from Category", Category.class).list();
    }

    public Category getCategory(int Id){
        return session.get(Category.class, Id);
    }
}
