package _14_exception.triangleexception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     *
     * @throws InputMismatchException
     */
    public static void inputSide() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai canh a");
        int a = scanner.nextInt();
        System.out.println("Nhap vao do dai canh b");
        int b = scanner.nextInt();
        System.out.println("Nhap vao do dai canh c");
        int c = scanner.nextInt();
        if ((a < 0) || (b < 0) || (c < 0)) throw new InputMismatchException();
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) throw new InputMismatchException();
    }

    public static void main(String[] args) {
        try {
            inputSide();
        } catch (InputMismatchException e) {
            System.out.println("Loi roi");
        }
    }
}
