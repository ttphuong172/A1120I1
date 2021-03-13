package _07_abstract_interface.bt.resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double heigth;

    public Rectangle(String color, double width, double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }



    @Override
    public double resize(double percent) {
        return this.getArea()+percent/100*this.getArea();
    }

    @Override
    public double getArea() {
        return this.heigth*this.width;
    }
}
