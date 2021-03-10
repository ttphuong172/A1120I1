package _06_inhenritance.bt.movablepoint;

import org.ietf.jgss.Oid;

public class TestPoint {
    public static void main(String[] args) {
        Point point1=new Point();
        System.out.println(point1);
        Point point2=new Point(5.6f,9.4f);
        System.out.println(point2);
    }
}
