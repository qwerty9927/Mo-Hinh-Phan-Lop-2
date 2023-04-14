package BLL;

import DAL.ImportProductDAL;
import Entity.Category;
import Entity.Vegetable;
import java.util.ArrayList;

public class ImportProductBLL {

    ImportProductDAL ipDAL = new ImportProductDAL();

    ;
    public ImportProductBLL() {
    }

    public ArrayList<Vegetable> vegetableList() {
        return ipDAL.vegetableList();
    }

    public ArrayList<Category> categoryList() {
        return ipDAL.categoryList();
    }

    public boolean createVegetable(Vegetable vegetable) {
        return ipDAL.createVegetable(vegetable);
    }

    public boolean createCategory(Category c) {
        return ipDAL.createCategory(c);
    }

    public boolean removeVegetable(Vegetable v) {
        return ipDAL.removeVegetable(v);
    }

    public boolean removeCategory(Category c) {
        return ipDAL.removeCategory(c);
    }

    public boolean updateVegetable(Vegetable v) {
        return ipDAL.updateVegetable(v);
    }

    public boolean updateCategory(Category c) {
        return ipDAL.updateCategory(c);
    }

    public ArrayList findCategory(String name) {
        ArrayList<Category> foundList = new ArrayList<Category>();
        for (Category c : categoryList()) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                foundList.add(c);
            }
        }
        System.out.println(foundList);
        return foundList;
    }
    
    public ArrayList findVegetable(String name) {
        ArrayList<Vegetable> foundList = new ArrayList<Vegetable>();
        for (Vegetable v : vegetableList()) {
            if (v.getVegetableName().toLowerCase().contains(name.toLowerCase())) {
                foundList.add(v);
            }
        }
        System.out.println(foundList);
        return foundList;
    }

    public Vegetable getVegetable(int Id) {
        return ipDAL.getVegetable(Id);
    }

    public Category getCategory(int Id) {
        return ipDAL.getCategory(Id);
    }

    public Category getCategoryByName(String name) {
        for (Category c : categoryList()) {
            if ((name).equals(c.getName())) {
                return c;
            }
        }
        return new Category();
    }
}

/*
 * @author KhanhPham
 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
