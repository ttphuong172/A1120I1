package _1_introductiontoJava;

import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        String dayInMonth;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Nhap vao thang can kiem tra");
        int month=scaner.nextInt();
        switch (month){
            case 2:
                dayInMonth="28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth="31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth="30";
                break;
            default:
                dayInMonth="";
                break;
        }
        if(!dayInMonth.equals("")){
            System.out.println("Thang "+month+" co "+dayInMonth+" ngay");
        } else{
            System.out.println("Lam gi co thang "+month+" cha noi");
        }

    }
}
