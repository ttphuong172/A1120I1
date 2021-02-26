package _3_array.Test;
import java.util.Scanner;
public class NhapMangDungFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[];
        System.out.println("Nhap do dai mang can tao");
        int dodai=scanner.nextInt();
        arr=new int[dodai];
        for(int i=0;i<arr.length;i++){
            do{
                System.out.println("Nhap phan tu thu"+i);
                arr[i]=scanner.nextInt();
            } while ((arr[i]>10) || (arr[i]<0));

        }
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
    }


}
