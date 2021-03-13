package _06_inhenritance.bt.triangle;

public class Shape {
    public String color;

    public Shape() {
        color="green";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  color;
    }
}
