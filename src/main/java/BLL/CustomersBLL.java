/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CustomersDAL;
import Entity.Customers;
import java.util.List;

/**
 *
 * @author kusod
 */
public class CustomersBLL {
    private CustomersDAL cusDAL;

    public CustomersBLL() {
        cusDAL = new CustomersDAL();
    }

    public List loadCustomers() {
        List list = cusDAL.loadCustomer();
        return list;

    }

    public Object[][] convertList(List<Customers> list) {
        int rows = list.size();
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getCustomerID();
            obj[i][1] = list.get(i).getFullname();
            obj[i][2] = list.get(i).getPassword();
            obj[i][3] = list.get(i).getAddress();
            obj[i][4] = list.get(i).getCity();
        }
        return obj;
    }

    public void addCustomer(Customers c) {
        cusDAL.addCustomer(c);
    }

    public void updateCustomer(Customers c) {
        cusDAL.updateCustomer(c);
    }

    public void deleteCustomer(Integer id) {
        Customers c = getCustomer(id);
        if(c != null){
            cusDAL.deleteCustomer(c);
        }
        
    }
    
    public List searchCustomer(String name){
        return cusDAL.searchCustomer(name);
    }

    public void newCustomer(Customers c) {
        cusDAL.addCustomer(c);
    }

    public Customers getCustomer(int Id) {
        Customers c = cusDAL.getCustomer(Id);
        return c;
    }
}
