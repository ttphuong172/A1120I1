package _06_inhenritance.th.shape;

public class TestRectange {
    public static void main(String[] args) {
        Rectange rectange1=new Rectange();
        System.out.println(rectange1);
        Rectange rectange2=new Rectange(2.0,3.0);
        System.out.println(rectange2);
        Rectange rectange3=new Rectange("red",true,5.0,10.0);
        System.out.println(rectange3);
    }
}
