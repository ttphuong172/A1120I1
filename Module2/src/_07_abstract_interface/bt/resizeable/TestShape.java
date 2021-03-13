package _07_abstract_interface.bt.resizeable;

import _07_abstract_interface.th.animal.Animal;

public class TestShape {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle("red", 2.4);
        shapes[1] = new Rectangle("green", 2.9, 2.0);
        shapes[2] = new Square("blue", 5.0);
        double random = Math.floor(Math.random() * 100) ;
        //System.out.println(random);
        for (Shape shape : shapes) {
            System.out.println("Dien tich ban dau:" + shape.getArea() + ", dien tich sau resize: " + shape.resize(random));
        }

    }
}
