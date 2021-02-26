package _2_loop.TH;
import java.util.Scanner;
public class UCLN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
        int b =scanner.nextInt();
        while (a!=b){
            if (a>b){
                a=a-b;
            } else
                b=b-a;
        }
        System.out.println("UCLN: "+a);
    }


}
