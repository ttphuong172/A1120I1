package _3_Array.TH;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class TimGiaTriNhoNhatDungPhuongThuc {

    public static int findMin(int [] array){
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[];
        System.out.println("Nhap vao do dai cua mang");
        int dodai=scanner.nextInt();
        arr=new int[dodai];
        int i=0;
        while (i<dodai){
            System.out.println("Phan tu thu "+(i+1));
            arr[i]=scanner.nextInt();
            i++;
        }
        for(int element:arr){
            System.out.println(element);
        }
        System.out.println("Gia tri nho nhat la: "+findMin(arr));
    }


}
