package furamaresort.models;

import java.util.Objects;

public abstract class Services implements Comparable<Services> {
    private String id;
    private String serviceName;
    private int areaUse;
    private int rentalCost;
    private int maxPerson;
    private String rentalForm;

    public Services() {
    }

    public Services(String id, String serviceName, int areaUse, int rentalCost, int maxPerson, String rentalForm) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.rentalCost = rentalCost;
        this.maxPerson = maxPerson;
        this.rentalForm = rentalForm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(int areaUse) {
        this.areaUse = areaUse;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentalForm() {
        return rentalForm;
    }

    public void setRentalForm(String rentalForm) {
        this.rentalForm = rentalForm;
    }
    public abstract void showInfor();



    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", rentalCost=" + rentalCost +
                ", maxPerson=" + maxPerson +
                ", rentalForm='" + rentalForm + '\'' +
                '}';
    }

}
