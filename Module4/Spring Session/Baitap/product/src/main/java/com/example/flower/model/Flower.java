package com.example.flower.model;

import javax.persistence.*;

@Entity
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    private int oldprice;
    private int price;
    private String image;
    private boolean isNew;

    public Flower() {
    }

    public Flower(int id, String name, int oldprice, int price, String image, boolean isNew) {
        this.id = id;
        this.name = name;
        this.oldprice = oldprice;
        this.price = price;
        this.image = image;
        this.isNew = isNew;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOldprice() {
        return oldprice;
    }

    public void setOldprice(int oldprice) {
        this.oldprice = oldprice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", oldprice=" + oldprice +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}

