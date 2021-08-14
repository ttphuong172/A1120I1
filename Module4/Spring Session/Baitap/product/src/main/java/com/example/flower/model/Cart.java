package com.example.flower.model;

import javax.persistence.Entity;

public class Cart {
    private int id;
    private Flower flower;
    private int quantity;

    public Cart() {
    }

    public Cart(int id, Flower flower, int quantity) {
        this.id = id;
        this.flower = flower;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
