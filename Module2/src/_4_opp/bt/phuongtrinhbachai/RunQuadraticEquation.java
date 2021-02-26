package _4_opp.bt.phuongtrinhbachai;
import _4_opp.TH.LopHinhChuNhat.Rectangle;

import java.util.Scanner;
public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao tham so a");
        double a=scanner.nextDouble();
        System.out.println("Nhap vao tham so b");
        double b=scanner.nextDouble();
        System.out.println("Nhap vao tham so c");
        double c=scanner.nextDouble();

        QuadraticEquation ptb2=new QuadraticEquation(a,b,c);
         if (ptb2.getDiscriminant()<0){
             System.out.println("The equation has no roots");
         } else if (ptb2.getDiscriminant()==0){
             System.out.println("Phuong trinh co nghiem kep"+ ptb2.getRoot1());
         } else {
             System.out.println("Phuong trinh co 2 nghiem");
             System.out.println("Nghiem 1:"+ ptb2.getRoot1());
             System.out.println("Nghiem 2: "+ ptb2.getRoot2());
         }

    }

}
