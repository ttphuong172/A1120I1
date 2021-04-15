package _10_stack_queue._reverse_array;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        Queue<String> myQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra");
        String myString = scanner.nextLine();
        String[] myArr = myString.split("");
        //Dua mang vao Stack va Queue
        for (int i = 0; i < myArr.length; i++) {
            myStack.push(myArr[i]);
            myQueue.add(myArr[i]);
        }
        boolean doiXung = true;
        while (!myStack.isEmpty()) {
//            System.out.println(myStack.pop());
//            System.out.println(myQueue.poll());
            if (!myStack.pop().equals(myQueue.poll())) {
                doiXung = false;
                break;
            }
        }
        if (doiXung) {
            System.out.println("Doi xung");
        } else {
            System.out.println("Khong doi xung");
        }


    }
}
