package _3_array.th;
import java.util.Scanner;
public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr;
        System.out.println("Nhap vao do dai cua mang");
        int dodai=scanner.nextInt();
        arr=new int[dodai];
        int i=0;
        while(i<dodai){
            System.out.println("Nhap vao phan tu thu "+(i+1));
            arr[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Mang ban dau: ");
        for (int element:arr){
            System.out.print(element+ "  ");
        }
        int max=arr[0];
        for(int index=0;index<arr.length;index++){
            if (arr[index]>max){
                max=arr[index];
            }
        }
        System.out.println();
        System.out.print("Gia tri lon nhat la: "+max);

    }
}
