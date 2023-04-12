package DAL;

import Entity.Category;
import Entity.OrderDetail;
import Entity.Vegetable;
import Util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatisticalDAL {

    private Session session;
    public StatisticalDAL(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    public List statisticalRevenueOfCategory(int month, int year){
        ArrayList<Float> listRevenue = new ArrayList<>();
        List<Category> categories = session.createQuery("from Category", Category.class).list();
        categories.forEach(category -> {
            List<Vegetable> vegetables = category.getVegetables();
            final float[] totalCategory = {0};
            vegetables.forEach(vegetable -> {
                OrderDetail od = vegetable.getOrderDetail();
                if(od != null){
                    Date date = od.getOrder().getDate();
                    if(date.getMonth() + 1 == month && date.getYear() + 1900 == year) {
                        totalCategory[0] += od.getPrice() * od.getQuantity();
                    }
                }
            });
            listRevenue.add(totalCategory[0]);
        });
//        listRevenue.forEach(aFloat -> System.out.println(aFloat));
        return listRevenue;
    }
}
