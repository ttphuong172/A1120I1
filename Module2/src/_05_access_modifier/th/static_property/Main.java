package _05_access_modifier.th.static_property;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("ford","ecoboot");
        System.out.println(Car.numberofCars);
        Car car2=new Car("vios","dual VVTi");
        System.out.println(Car.numberofCars);
    }
}
