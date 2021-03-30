package _07_abstract_interface.homework.canbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        CanBo canBo;
        int choice;
        String ten;
        int namSinh;
        boolean gioiTinh;
        String diaChi;
        String nganhDaoTao;
        String bac;
        String congViec;
        do {
            System.out.println("1. Them moi Ky Su");
            System.out.println("2. Them moi Cong Nhan");
            System.out.println("3. Them moi Phuc Vu");
            System.out.println("4. Hien thi can bo");
            System.out.println("5. Tim kien can bo");
            System.out.println("6. Xoa can bo");
            System.out.println("0. Exit");
            System.out.println("Enter choice");
            choice = scanner.nextInt();
            //scanner.skip("\\R");
            scanner.nextLine();
            if (choice == 1 || choice == 2 || choice == 3) {
                System.out.println("Nhap ten");
                ten = scanner.nextLine();
                System.out.println("Nhap nam sinh");
                namSinh = scanner.nextInt();
                //scanner.skip("\\R");
                scanner.nextLine();
                System.out.println("Nhap gioi tinh");
                gioiTinh = scanner.nextBoolean();
                //scanner.skip("\\R");
                scanner.nextLine();
                System.out.println("Nhap dia chi");
                diaChi = scanner.nextLine();
                if (choice == 1) {
                    System.out.println("Nhap nganh dao tao");
                    nganhDaoTao = scanner.nextLine();
                    canBo = new KySu(ten, namSinh, gioiTinh, diaChi, nganhDaoTao);
                    qlcb.themMoiCanBo(canBo);
                } else if (choice == 2) {
                    System.out.println("Nhap bac cong nhan");
                    bac = scanner.nextLine();
                    canBo = new CongNhan(ten, namSinh, gioiTinh, diaChi, bac);
                    qlcb.themMoiCanBo(canBo);
                } else {
                    System.out.println("Nhap cong viec");
                    congViec = scanner.nextLine();
                    canBo = new PhucVu(ten, namSinh, gioiTinh, diaChi, congViec);
                    qlcb.themMoiCanBo(canBo);
                }
            } else if (choice == 4) {
                for (CanBo canbo : qlcb.danhSachCanBo) {
                    System.out.println(canbo);
                }
            } else if (choice == 5) {
                System.out.println("Nhap ten can tim");
                String giaTri = scanner.nextLine();
                qlcb.timCanbo(giaTri);
            } else if (choice == 6) {
                System.out.println("Nhap ten can xoa");
                String giaTri = scanner.nextLine();
                qlcb.xoaCanBo(giaTri);
            } else if (choice == 0) {
                System.exit(0);
            }


        } while (true);

    }
}
