package _07_abstract_interface.homework.library;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        QLTV qltv1=new QLTV();
        TaiLieu taiLieu1=new Sach(1,"ABC",123,"Phuong",123);
        TaiLieu taiLieu2=new Bao(2,"ThanhNien",200,"03/07/2020");
        TaiLieu taiLieu3=new TapChi(3,"Playboy",2,2,12);
        qltv1.themMoiTaiLieu(taiLieu1);
        //qltv1.themMoiTaiLieu(taiLieu2);
        qltv1.themMoiTaiLieu(taiLieu3);
        qltv1.timTaiLieu();
        qltv1.hienThiTaiLieu();
        System.out.println(taiLieu2);
        System.out.println(taiLieu1 instanceof Sach);
    }

}
