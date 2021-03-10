package _06_inhenritance.bt.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder1=new Cylinder();
        System.out.println(cylinder1);
        Cylinder cylinder2=new Cylinder(3.0);
        System.out.println(cylinder2);
        Cylinder cylinder3=new Cylinder(6.0,"red",7.0);
        System.out.println(cylinder3);
    }
}
