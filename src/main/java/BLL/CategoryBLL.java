package BLL;

import DAL.CategoryDAL;

import java.util.ArrayList;
import java.util.List;

public class CategoryBLL {

    private CategoryDAL cDAL;

    public CategoryBLL(){
        cDAL = new CategoryDAL();
    }
    public List getCategoryName(){
        ArrayList<String> listName = new ArrayList<>();
        cDAL.loadCategory().forEach(category -> listName.add(category.getName()));
        return listName;
    }
}
