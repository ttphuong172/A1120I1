package _06_inhenritance.bt.point;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D1=new Point3D();
        System.out.println(point3D1);
        Point3D point3D2=new Point3D(5.6f,4.3f,5.2f);
        for ( float element:point3D2.getXYZ()){
            System.out.println(element);
        }
    }
}
