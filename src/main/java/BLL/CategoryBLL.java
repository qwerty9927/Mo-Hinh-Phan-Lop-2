package BLL;

import DAL.CategoryDAL;
import Entity.Category;
import java.util.List;

public class CategoryBLL {

    private CategoryDAL cDAL;

    public CategoryBLL() {
        cDAL = new CategoryDAL();
    }

    public List loadCategory() {
        List list = cDAL.loadCategory();
        return list;

    }

    public Object[][] convertList(List<Category> list) {
        int rows = list.size();
        int cols = 7;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getCatagoryID();
            obj[i][1] = list.get(i).getName();
            obj[i][2] = list.get(i).getDescription();
            obj[i][3] = list.get(i).getVegetables().size();
        }
        return obj;
    }

    public void addCategory(Category c) {
        cDAL.addCategory(c);
    }

    public void updateCategory(Category c) {
        cDAL.updateCategory(c);
    }

    public void deleteCategory(Category c) {
        cDAL.deleteCategory(c);
    }

    public void newCategory(Category c) {
        cDAL.addCategory(c);
    }

    public Category getCategory(int Id) {
        Category c = cDAL.getCategory(Id);
        return c;
    }
}

/*
 * @author KhanhPham
 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
