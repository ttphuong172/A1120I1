package _10_stack_queue._reverse_array;

import java.util.Scanner;
import java.util.Stack;

public class StackString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack <String> wStack = new Stack<>();
        System.out.println("Nhap vao mot chuoi");
        String str=scanner.nextLine();
        String[] temp = str.split(" ");
        for(int i=0;i<temp.length;i++){
            wStack.push(temp[i]);
           // System.out.println(temp[i]);
        }
        //Lay tu Stack ra mang
        int k=0;
        while(!wStack.isEmpty()){
            temp[k]=wStack.pop();
            k++;
        }

        // Noi chuoi tu mang
        String outp="";
        for(int i=0;i<temp.length;i++){

           outp+=temp[i]+ " ";
        }
        System.out.println(outp);
    }

}
