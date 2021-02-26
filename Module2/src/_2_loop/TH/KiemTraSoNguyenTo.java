package _2_loop.TH;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so nguyen to");
        int number=scanner.nextInt();
        if(number<2){
            System.out.println(number+" not is prime");
        } else {
            boolean check=true;
            for(int index=2;index<=Math.sqrt(number);index++ ){
                System.out.println(index);
                if (number%index==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println(number+" is prime");
            } else {
                System.out.println(number+" is not prime");
            }
        }
    }
}
