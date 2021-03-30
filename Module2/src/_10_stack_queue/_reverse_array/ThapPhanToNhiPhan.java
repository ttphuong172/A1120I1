package _10_stack_queue._reverse_array;

import javax.security.auth.kerberos.KerberosTicket;
import java.util.Scanner;
import java.util.Stack;

public class ThapPhanToNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();
        System.out.println("Nhap vao so thap phan: ");
        int soThapPhan = scanner.nextInt();
        while (soThapPhan > 0) {
            myStack.push(soThapPhan % 2);
            soThapPhan = soThapPhan / 2;
        }
        String ketQua = "";
        while (!myStack.isEmpty()) {
            ketQua += myStack.pop();
        }
        System.out.println("So nhi phan: " + ketQua);
    }
}
