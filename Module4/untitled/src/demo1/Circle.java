package demo1;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double area= Math.pow(radius,2)* Math.PI;
        System.out.println(area);
    }
}

