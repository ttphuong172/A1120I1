package _2_loop.BT;

import java.util.Scanner;

public class InHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chieu dai: ");
        int dai = scanner.nextInt();
        System.out.print("Nhap vao chieu rong: ");
        int rong = scanner.nextInt();
        for (int i = 0; i < rong; i++) {
            System.out.println("\n");
            for (int j = 0; j < dai; j++) {
                System.out.print('*');
            }
        }
    }
}
