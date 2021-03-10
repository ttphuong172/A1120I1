package _06_inhenritance.th.shape;

public class TestSquare {
    public static void main(String[] args) {
        Square square1=new Square();
        System.out.println(square1);
        Square square2=new Square(2.3);
        System.out.println(square2);
        Square square3=new Square("yellow",true,5.0);
        System.out.println(square3);
    }
}
