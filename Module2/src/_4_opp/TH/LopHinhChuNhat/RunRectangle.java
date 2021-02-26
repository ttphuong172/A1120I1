package _4_opp.TH.LopHinhChuNhat;
import java.util.Scanner;
public class RunRectangle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap vao chieu rong: ");
        double width=scanner.nextDouble();
        System.out.println("Nhap vao chieu cao:");
        double height=scanner.nextDouble();

        Rectangle hcn=new Rectangle(width,height);
        System.out.println(hcn.display());
        System.out.println("Dien tich hinh chu nhat: "+hcn.getArea());
        System.out.println("Chu vi hinh chu nhat: "+hcn.getPerimetter());
    }


}
