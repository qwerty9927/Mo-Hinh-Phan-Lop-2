package Entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Category implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CatagoryID;

    @Column
    private String Name;

    @Column
    private String Description;

    @OneToMany(mappedBy = "category")
    private List<Vegetable> vegetables;

    public int getCatagoryID() {
        return CatagoryID;
    }

    public void setCatagoryID(int catagoryID) {
        CatagoryID = catagoryID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Category{" +
                "CatagoryID=" + CatagoryID +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
