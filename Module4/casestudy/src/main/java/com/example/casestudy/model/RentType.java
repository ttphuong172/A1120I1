package com.example.casestudy.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentTypeId;
    private String rentTypeName;
    private double rentTypeCost;
    @OneToMany(mappedBy="rentType")
    List<Service> serviceList;

    public RentType() {
    }

    public RentType(int rentTypeId, String rentTypeName, double rentTypeCost, List<Service> serviceList) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.rentTypeCost = rentTypeCost;
        this.serviceList = serviceList;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }


}
