package _06_inhenritance.th.shape;

public class Rectange extends Shape {
    public double width;
    public double length;

    public Rectange() {
        this.width=1.0;
        this.length=1.0;
    }

    public Rectange(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectange(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }




    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
