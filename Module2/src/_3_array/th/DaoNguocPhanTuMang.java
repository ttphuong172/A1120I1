package _3_array.th;
import java.util.Scanner;
public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[];
        System.out.println("Nhap vao do dai mang:");
        int dodai=scanner.nextInt();
        arr=new int[dodai];
        int i=0;
        while (i<dodai){
            System.out.println("Phan thu thu "+i);
            arr[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Mang ban dau:");
        for(int element:arr){
            System.out.print(element+" ");
        }
        int arr1 []=new int[dodai];
        for (int j=0;j<arr.length;j++){
           arr1[j] =arr[arr.length-1-j];
        }
        System.out.println("\n");
        System.out.print("Mang sau khi dao:");
        for(int element:arr1){
            System.out.print(element+" ");
        }
    }


}
