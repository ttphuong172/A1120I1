package _1_IntroductiontoJava;

import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Giai phuong trinh babc nhat");
        System.out.println("Nhap vao tham so a");
        double a=scanner.nextDouble();
        System.out.println("Nhap vao tham so b");
        double b=scanner.nextDouble();
        if (a!=0){
            double solution=-b/a;
            System.out.println("The solution is: "+ solution);
        } else{
            if(b==0){
                System.out.println("The solution is all x");
            } else{
                System.out.println("No solution");
            }
        }
    }
}