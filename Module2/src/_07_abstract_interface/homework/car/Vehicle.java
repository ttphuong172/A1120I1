package _07_abstract_interface.homework.car;

public class Vehicle {
    private double value;
    private int volume;


    public Vehicle() {
    }
    public Vehicle(double value, int volume) {
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
        if (this.volume<100){
            tax=this.value*1/100;
        } else if (this.volume<200){
            tax=this.value*2/100;
        } else{
            tax=this.value*3/100;
        }
            return tax;
    }
    public void showCar(){
        System.out.println("Gia xe: "+value+", dung tich xe: "+volume+", thue la: "+calcTax());
    }
}
