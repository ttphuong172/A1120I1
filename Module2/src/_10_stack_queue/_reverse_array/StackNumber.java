package _10_stack_queue._reverse_array;

import _07_abstract_interface.homework.demo.A;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class StackNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> wStack = new Stack<>();
        System.out.println("Nhap do dai mang: ");
        int doDai=scanner.nextInt();
        int arr[]= new int[doDai];
        for(int i=0;i<doDai;i++){
            System.out.println("Nhap vao phan tu thu "+(i+1));
            arr[i]=scanner.nextInt();
        }
        System.out.println("Mang ban dau");
        for(int element:arr){
            System.out.print(element+ "\t");
        }
        //Dua vao Stack
        for(int j=0;j<doDai;j++){
            wStack.push(arr[j]);
            //arr[j]=0;
        }
        //Lay tu Stack ra mang ban dau
        int k=0;
        while (!wStack.isEmpty()){
            arr[k]=wStack.pop();
            k++;
        }
        System.out.println();
        System.out.println("Mang sau khi xu ly");
        for(int element:arr){
            System.out.print(element+ "\t");
        }




    }


}
