package _2_loop.th;
import java.util.Scanner;
public class LaiSuatNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so tien gui: ");
        double sotien=scanner.nextDouble();
        System.out.print("Nhap vao so thang gui: ");
        int sothang=scanner.nextInt();
        System.out.print("Nhap vao lai suat: ");
        double laisuat=scanner.nextDouble();

        double sotien_nhanduoc = sotien * (laisuat/100)/12 * sothang;

        System.out.println("So tien nhan duoc: "+ sotien_nhanduoc);
    }
}
