package _3_array.TH;
import  java.util.Scanner;
public class ChuyenDoiNhietDo {
    public static double ctoF(double c){
        return c*1.8+32;
    }
    public static double ftoC(double f){
        return (f-32)/1.8;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double c;
        double f;
        int choice;
            do {
                System.out.println("Menu.");
                System.out.println("1. Fahrenheit to Celsius");
                System.out.println("2. Celsius to Fahrenheit");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Nhap vao do F");
                        f=scanner.nextDouble();
                        System.out.println("Nhiet do C"+ftoC(f));
                        break;
                    case 2:
                        System.out.println("Nhap vao do C");
                        c=scanner.nextDouble();
                        System.out.println("Nhiet do F"+ctoF(c));
                        break;
                    case 0:
                        System.exit(0);
                }
            } while (choice != 0);
        }
    }
