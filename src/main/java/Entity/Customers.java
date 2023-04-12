package Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerID;

    @Column
    private String Password;

    @Column
    private String Fullname;

    @Column
    private String Address;

    @Column
    private String City;

    @OneToMany(mappedBy = "customers")
    private List<Order> orders;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "CustomerID=" + CustomerID +
                ", Password='" + Password + '\'' +
                ", Fullname='" + Fullname + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
