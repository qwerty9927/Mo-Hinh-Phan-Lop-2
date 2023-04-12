package Entity;

import jakarta.persistence.*;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DetailID;

    @Column
    private byte Quantity;

    @Column
    private Float Price;

    @ManyToOne
    @JoinColumn(name = "OrderID")
    private Order order;

    @OneToOne
    @JoinColumn(name = "VegetableID")
    private Vegetable vegetable;

    public int getDetailID() {
        return DetailID;
    }

    public void setDetailID(int detailID) {
        DetailID = detailID;
    }

    public byte getQuantity() {
        return Quantity;
    }

    public void setQuantity(byte quantity) {
        Quantity = quantity;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Vegetable getVegetable() {
        return vegetable;
    }

    public void setVegetable(Vegetable vegetable) {
        this.vegetable = vegetable;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "DetailID=" + DetailID +
                ", Quantity=" + Quantity +
                ", Price=" + Price +
                '}';
    }
}
