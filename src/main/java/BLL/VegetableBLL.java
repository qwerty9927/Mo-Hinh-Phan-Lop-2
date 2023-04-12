package BLL;

import Entity.Vegetable;
import DAL.VegetableDAL;
import java.util.List;

public class VegetableBLL {

    private VegetableDAL vDAL;

    public VegetableBLL() {
        vDAL = new VegetableDAL();
    }

    public List loadVegetable() {
        List list = vDAL.loadVegetable();
        return list;

    }

    public Object[][] convertList(List<Vegetable> list) {
        int rows = list.size();
        int cols = 7;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getVegetableID();
            obj[i][1] = list.get(i).getCategory().getName();
            obj[i][2] = list.get(i).getUnit();
            obj[i][3] = list.get(i).getAmount();
            obj[i][4] = list.get(i).getImage();
            obj[i][4] = list.get(i).getPrice();
        }
        return obj;
    }

    public void addVegetable(Vegetable v) {
        vDAL.addVegetable(v);
    }

    public void updateVegetable(Vegetable v) {
        vDAL.updateVegetable(v);
    }

    public void deleteVegetable(Vegetable v) {
        vDAL.deleteVegetable(v);
    }

    public void newVegetable(Vegetable c) {
        vDAL.addVegetable(c);
    }

    public Vegetable getVegetable(int Id) {
        Vegetable c = vDAL.getVegetable(Id);
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
