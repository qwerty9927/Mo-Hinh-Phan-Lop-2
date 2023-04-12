package Entity;

import jakarta.persistence.*;

@Entity
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int VegetableID;

    @Column(name = "Vegetable_Name")
    private String VegetableName;

    @Column
    private String Unit;

    @Column
    private int Amount;

    @Column
    private String Image;

    @Column
    private Double Price;

    @ManyToOne
    @JoinColumn(name = "CatagoryID")
    private Category category;

    @OneToOne(mappedBy = "vegetable")
    private OrderDetail orderDetail;

    public int getVegetableID() {
        return VegetableID;
    }

    public void setVegetableID(int vegetableID) {
        VegetableID = vegetableID;
    }

    public String getVegetableName() {
        return VegetableName;
    }

    public void setVegetableName(String vegetableName) {
        VegetableName = vegetableName;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "VegetableID=" + VegetableID +
                ", VegetableName='" + VegetableName + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Amount=" + Amount +
                ", Image='" + Image + '\'' +
                ", Price=" + Price +
                '}';
    }
}
