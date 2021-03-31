package _demo._generic._trycatch;

import java.util.Scanner;

public class NumberFormatExceotion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        String myNumber=scanner.nextLine();
        try {
            int yourNumber = Integer.parseInt(myNumber);
            System.out.println("So vua nhap:"+ yourNumber);
        } catch (NumberFormatException e){
            System.out.println("Ban da ko nhap so");
        }


    }
}
