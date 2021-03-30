package _10_stack_queue._reverse_array;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String ngoacTrai = "(";
        String ngoacPhai = ")";
        Scanner scanner = new Scanner(System.in);
        Stack myStack = new Stack();
        System.out.println("Nhap vao bieu thuc can kiem tra: ");
        String myString = scanner.nextLine();
        String myArr[] = myString.split("");
        boolean ketQua=true;
        String sym="";
        String left="";

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i].equals(ngoacTrai)) {
                sym+=myArr[i];
                myStack.push(myArr[i]);
            }
        }

        for (int j=0;j<myArr.length;j++){
            if (myArr[j].equals(ngoacPhai)){
                if(myStack.isEmpty()){
                    ketQua=false;
                } else{
                    left+=myStack.pop();

                }
            }
        }
        if (!sym.equals(left)){
            ketQua=false;
        }
        System.out.println("Sym: "+sym);
        System.out.println("Left: "+left);
        if (ketQua){
            System.out.println("Bieu thuc dung");
        } else{
            System.out.println("Bieu thuc sai");
        }

    }

}
