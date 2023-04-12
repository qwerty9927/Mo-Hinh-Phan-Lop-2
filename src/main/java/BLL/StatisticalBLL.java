package BLL;

import DAL.StatisticalDAL;

import java.util.List;

public class StatisticalBLL {

    private StatisticalDAL sDAL;

    public StatisticalBLL(){
        sDAL = new StatisticalDAL();
    }

    public Object[][] convertStatistical(List listCategory, List listRevenue){
        int row = listCategory.size();
        int col = 2;
        Object[][] obj = new Object[row][col];
        for(int i = 0;i < row;i++){
            obj[i][0] = listCategory.get(i);
            obj[i][1] = listRevenue.get(i);
        }
        return obj;
    }

    public List getRevenueOfCategory(int month, int year){
        return sDAL.statisticalRevenueOfCategory(month, year);
    }

}
