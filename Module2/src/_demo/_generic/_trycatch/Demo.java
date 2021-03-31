package _demo._generic._trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double [] myArray=new double[10];
        for (int i=0;i<10;i++){
            myArray[i]=Math.random()*100;
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vap phan tu thu:");
        try {
            int choice=scanner.nextInt();
            System.out.println(myArray[choice]);
        } catch (InputMismatchException e){
            System.out.println("Vui long nhap vao so nguyen");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Vui long nhap tu 0-9");
        }



    }
}
