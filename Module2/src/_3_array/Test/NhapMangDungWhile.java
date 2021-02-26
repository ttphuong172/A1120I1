package _3_array.Test;
import java.util.Scanner;
public class NhapMangDungWhile {
    public static void main(String[] args) {
        int arr[];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang");
        int dodai=scanner.nextInt();
        arr=new int[dodai];
        int i=0;
        while (i<arr.length){
            System.out.println("Nhap vao phan tu thu" + (i+1));
            arr[i]=scanner.nextInt();
            i++;
        }
        for(int element:arr){
            System.out.print(element);
        }
    }
}
