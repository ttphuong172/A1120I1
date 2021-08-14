package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "adsress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "city")
    private String city;
    @OneToMany(mappedBy = "address")
    @JsonIgnore
    List<Customer> customerList;

    public Address() {
    }

    public Address(String city, List<Customer> customerList) {
        this.city = city;
        this.customerList = customerList;
    }

    public Address(int id, String city, List<Customer> customerList) {
        this.id = id;
        this.city = city;
        this.customerList = customerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
