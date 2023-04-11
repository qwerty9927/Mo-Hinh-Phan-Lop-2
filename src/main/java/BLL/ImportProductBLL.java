package BLL;

import DAL.ImportProductDAL;
import Entity.Category;
import Entity.Vegetable;
import java.util.ArrayList;

public class ImportProductBLL {
    ImportProductDAL ipDAL;
    public ImportProductBLL() {
        ipDAL = new ImportProductDAL();
    }
    
    public ArrayList productList(){
        return ipDAL.productList();
    }
    
    public ArrayList catgoryList(){
        return ipDAL.categoryList();
    }
    
    public boolean importProduct(Vegetable vegetable){
        return ipDAL.Import(vegetable);
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
