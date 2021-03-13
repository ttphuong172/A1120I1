package _06_inhenritance.bt.triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1=new Triangle();
        System.out.println(triangle1.getArea());
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1);
        Triangle triangle2=new Triangle(3.5,5.2,6.3);
        System.out.println(triangle2.getArea());
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2);
    }
}
