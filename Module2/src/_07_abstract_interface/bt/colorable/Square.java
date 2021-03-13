package _07_abstract_interface.bt.colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return Math.pow(this.side,2);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
