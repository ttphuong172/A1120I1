package _07_abstract_interface.bt.resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }




    @Override
    public double resize(double percent) {
        return this.getArea()+percent/100*this.getArea();
    }


    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
