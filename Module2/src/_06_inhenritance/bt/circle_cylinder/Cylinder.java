package _06_inhenritance.bt.circle_cylinder;

public class Cylinder extends Circle {
    public double height;

    public Cylinder() {
        this.height=1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
public double getVolume(){
        return this.getArea()*this.height;
}
    @Override
    public String toString() {
        return "Cylinder with volume: " + this.getVolume() +", "+ super.toString();
    }
}
