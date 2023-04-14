package BLL;

import DAL.ImportProductDAL;
import Entity.Category;
import Entity.Vegetable;
import java.util.ArrayList;

public class ImportProductBLL {
    ImportProductDAL ipDAL = new ImportProductDAL();;
    public ImportProductBLL() {
    }
    
    public ArrayList<Vegetable> productList(){
        return ipDAL.productList();
    }
    
    public ArrayList<Category> catgoryList(){
        return ipDAL.categoryList();
    }
    
    public boolean createVegetable(Vegetable vegetable){
        return ipDAL.createVegetable(vegetable);
    }
    
    public boolean createCategory(Category c){
        return ipDAL.createCategory(c);
    }
    
    public boolean removeVegetable(int id){
        return ipDAL.removeVegetable(id);
    }
    
    public boolean removeCategory(Category c){
        return ipDAL.removeCategory(c);
    }
    
    public boolean updateVegetable(Vegetable v){
        
        return ipDAL.updateVegetable(v);
    }
    
    public boolean updateCategory(Category c){
        
        return ipDAL.updateCategory(c);
    }
    
    public Vegetable getProduct(int Id) {
        return ipDAL.getProduct(Id);
    }
    
    public Category getCategory(int Id){
        return ipDAL.getCategory(Id);
    }
}

/*
 * @author KhanhPham
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
