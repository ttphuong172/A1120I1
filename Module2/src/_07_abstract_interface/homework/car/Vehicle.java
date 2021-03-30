package _07_abstract_interface.homework.car;

import _05_access_modifier.th.static_method.Student;

public class Vehicle implements Comparable{
    private String brand;
    private double value;
    private int volume;


    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle(String brand, double value, int volume) {
        this.brand=brand;
        this.value = value;
        this.volume = volume;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public double calcTax(){
        double tax;
        if (this.volume<=100){
            tax=this.value*1/100;
        } else if (this.volume<=200){
            tax=this.value*2/100;
        } else{
            tax=this.value*3/100;
        }
            return tax;
    }
    public void showCar(){
        System.out.println("Hang xe"+brand+"Gia xe: "+value+" dung tich xe: "+volume+". thue la: "+calcTax());
    }



    @Override
    public int compareTo(Object o) {

        Vehicle vehicle= (Vehicle) o;
        //Sap xep theo ten hang xe
        //return this.getBrand().compareTo(((Vehicle) o).getBrand());
        //Sắp xếp theo dung tich xi lanh
        return (int) (this.value-vehicle.value);
    }
}
