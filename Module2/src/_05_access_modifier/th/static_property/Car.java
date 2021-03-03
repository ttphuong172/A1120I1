package _05_access_modifier.th.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberofCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberofCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberofCars() {
        return numberofCars;
    }

    public static void setNumberofCars(int numberofCars) {
        Car.numberofCars = numberofCars;
    }
}
