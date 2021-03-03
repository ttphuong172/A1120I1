package _05_access_modifier.bt.cirle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius=1.0;
        color="red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.pow(Math.PI,2)*this.getRadius();
    }


}
