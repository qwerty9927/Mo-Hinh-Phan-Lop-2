package UI;

import BLL.CategoryBLL;
import BLL.VegetableBLL;
import Entity.Category;
import Entity.Vegetable;


public class Main {
    public static void main(String[] args) {
        VegetableBLL vBLL = new VegetableBLL();
        //Chưa có Categor
        CategoryBLL cBLL = new CategoryBLL();
        Category c = cBLL.getCategory(2);
        Vegetable v = new Vegetable();
        
        //Hiển thị danh sách rau củ
        for(Object vObject : vBLL.loadVegetable()){
            Vegetable vegetable = (Vegetable)vObject;
            System.out.println(vegetable);
        }
        
//        //Thêm 1 loại rau mới
//        v.setCategory(c);
//        v.setVegetableName("Zucchini");
//        v.setUnit("kg");
//        v.setAmount(10);
//        v.setImage("images/zucchini.jpg");
//        v.setPrice(30000.0);
//        
//        vBLL.addVegetable(v);
        
//        //Sửa một loại rau (1 hàng) đã có, thử sửa giá, còn những thuộc tính khác giữ nguyên
//        v = vBLL.getVegetable(9);
//        v.setPrice(32000.0);
//        
//        vBLL.updateVegetable(v);
        
//        //Xóa một loại rau có sẵn
//        v = vBLL.getVegetable(9);
//        
//        vBLL.deleteVegetable(v);
    }
}