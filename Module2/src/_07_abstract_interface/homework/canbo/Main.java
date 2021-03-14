package _07_abstract_interface.homework.canbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String ten;
        int namSinh;
        boolean gioiTinh;
        String diaChi;
        String nganhDaoTao;
        QLCB qlcb=new QLCB();
        //CanBo canBo;
        do {
            System.out.println("Menu");
            System.out.println("1.Them moi Ky Su");
            System.out.println("2.Them moi Cong Nhan");
            System.out.println("3.Them moi Phuc Vu");
            System.out.println("Enter choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten");
                    ten=scanner.nextLine();
                    System.out.println("Nhap nam sinh");
                    namSinh=scanner.nextInt();
                    System.out.println("Nhap gioi tinh");
                    gioiTinh=scanner.nextBoolean();
                    System.out.println("Nhap dia chi");
                    diaChi=scanner.nextLine();
                    //Phan them cua Ky Su
                    System.out.println("Nhap nganh dao tao");
                    nganhDaoTao=scanner.nextLine();
                    CanBo canBo=new KySu(ten,namSinh,gioiTinh,diaChi,nganhDaoTao);
                    qlcb.themMoiCanBo(canBo);
                    break;
                case 2:
                    System.out.println("Nhap ten");
                    ten=scanner.nextLine();
                    System.out.println("Nhap nam sinh");
                    namSinh=scanner.nextInt();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);
    }
}
