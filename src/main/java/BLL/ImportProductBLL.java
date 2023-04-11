package BLL;

import Entity.Vegetable;
import java.util.ArrayList;

public class ImportProductBLL {
    ImportProductBLL ipBLL;
    public ImportProductBLL() {
        ipBLL = new ImportProductBLL();
    }
    
    public ArrayList productList(){
        return ipBLL.productList();
    }
    
    public boolean importProduct(Vegetable vegetable){
        return ipBLL.importProduct(vegetable);
    }
}

/*
 * @author KhanhPham
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
