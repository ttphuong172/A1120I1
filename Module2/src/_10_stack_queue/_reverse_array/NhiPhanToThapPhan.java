package _10_stack_queue._reverse_array;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class NhiPhanToThapPhan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so nhi phan muon chuyen");
        String myString=scanner.nextLine();
        Queue<String> myQueue=new LinkedList<>();
        //String myString="10101";
        String [] myArray=myString.split("");
        for (int i=0;i<myArray.length;i++){
            myQueue.add(myArray[i]);
        }
        int doDai=myQueue.size()-1;
        int ketQua=0;
        while (!myQueue.isEmpty()){
            ketQua+=Integer.parseInt(myQueue.remove())*Math.pow(2,doDai);
            doDai--;
        }
        System.out.println(ketQua);
    }
}
