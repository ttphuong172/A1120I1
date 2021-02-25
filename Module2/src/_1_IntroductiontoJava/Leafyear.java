package _1_IntroductiontoJava;

import java.util.Scanner;
public class Leafyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra: ");
        int year=scanner.nextInt();
        boolean isDiv4=year%4==0;
        boolean isDiv100=year%100==0;
        boolean isDiv400=year%400==0;
        if(((isDiv4)&&(!isDiv100))||(isDiv400)){
            System.out.println("NĂM NHUÂN");
        } else{
            System.out.println("KO NHUAN");
        }
    }
}
