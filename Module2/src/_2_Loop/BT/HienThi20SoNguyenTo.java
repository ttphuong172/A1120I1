package _2_Loop.BT;
import java.util.Scanner;
public class HienThi20SoNguyenTo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=2;
        int count=0;
        System.out.println("Nhap vao so luong so nguyen to can hien thi: ");
        int numbers=scanner.nextInt();
        while (count<numbers){
            boolean check=true;
            for(int index=2;index<=Math.sqrt(N);index++ ){
                if (N%index==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println(N);
                count++;
            }
            N++;
            }
        }
    }

