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

    public List loadCategory(){
        Query query = session.createQuery("from Category", Category.class);
        List<Category> categories = query.list();
        return categories;
    }

    public Category getCategory(int Id){
        Category c = session.get(Category.class, Id);
        return c;
    }
}
