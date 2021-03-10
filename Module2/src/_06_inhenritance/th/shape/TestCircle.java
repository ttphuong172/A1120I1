package _06_inhenritance.th.shape;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        System.out.println(circle1);
        Circle circle2=new Circle(3.5);
        System.out.println(circle2);
        Circle circle3=new Circle("blue",true,5.2);
        System.out.println(circle3);
    }
}
