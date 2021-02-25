package _1_IntroductiontoJava;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        double bmi;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào cân nặng (theo kg)");
        double weigth=scanner.nextDouble();
        System.out.println("Nhập vào chiều cao (theo mét)");
        double height=scanner.nextDouble();
        bmi=weigth/(Math.pow(height,2));
        System.out.println("BMI: "+bmi);
        if (bmi>=30){
            System.out.println("Obese");
        } else if(bmi>=25){
            System.out.println("Overweight");
        } else if(bmi>=18.5){
            System.out.println("Normal");
        } else{
            System.out.println("Under weight");
        }
    }
    }

