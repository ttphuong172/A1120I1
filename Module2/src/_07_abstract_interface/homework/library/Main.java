package _07_abstract_interface.homework.library;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        int maTaiLieu;
        String nhaPhatHanh;
        int soBanPhatHanh;
        String tenTacGia;
        int soTrang;
        int soPhatHanh;
        int thangPhatHanh;
        TaiLieu taiLieu;
        QLTV qltv=new QLTV();
        do {
            System.out.println("1. Them moi Sach");
            System.out.println("2. Them moi Bao");
            System.out.println("3. Them moi Tap chi");
            System.out.println("4. Hien thi tat ca tai lieu");
            System.out.println("Nhap vao lua chon");
            choice=scanner.nextInt();
            if ((choice==1)|| (choice==2)||(choice==3)){
                System.out.print("Nhap ma tai lieu");
                maTaiLieu= scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhap nha phat hanh");
                nhaPhatHanh=scanner.nextLine();
                System.out.print("Nhap so ban phat hanh");
                soBanPhatHanh=scanner.nextInt();
                if(choice==1){
                    scanner.nextLine();
                    System.out.print("Nhap ten tac gia:");
                    tenTacGia=scanner.nextLine();
                    System.out.print("Nhap so trang:");
                    soTrang=scanner.nextInt();
                    taiLieu=new Sach(maTaiLieu,nhaPhatHanh,soBanPhatHanh,tenTacGia,soTrang);
                    qltv.themMoiTaiLieu(taiLieu);
                } else if(choice==2){
                //Cho nghien cuu Date
                } else{
                    System.out.println("Nhap so phat hanh:");
                    soPhatHanh=scanner.nextInt();
                    System.out.println("Nhap thang phat hanh:");
                    thangPhatHanh=scanner.nextInt();
                    taiLieu=new TapChi(maTaiLieu,nhaPhatHanh,soBanPhatHanh,soPhatHanh,thangPhatHanh);
                    qltv.themMoiTaiLieu(taiLieu);
                }
            }  else if (choice==4){
                qltv.hienThiTaiLieu();
            }

        } while (choice != 0);
    }
}
