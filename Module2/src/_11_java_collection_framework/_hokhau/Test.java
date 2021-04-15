package _11_java_collection_framework._hokhau;

import java.util.ArrayList;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ArrayList<Nguoi> s = new ArrayList<>();
        ArrayList<Nguoi> h = new ArrayList<>();
        ArrayList<HoGiaDinh> listHo = new ArrayList<>();
        Nguoi nguoi1 = new Nguoi("Tran Thanh Phuong", 35, "IT", 205115015);
        Nguoi nguoi2 = new Nguoi("Truong Bao Giang Chau", 35, "Comtor", 205421235);
        s.add(nguoi1);
        s.add(nguoi2);
        h.add(nguoi2);


        HoGiaDinh ho1 = new HoGiaDinh(4, "43 Cẩm Nam 7", s);
        HoGiaDinh ho2=new HoGiaDinh(5,"",h);
        listHo.add(ho1);
        listHo.add(ho2);
        for (HoGiaDinh e : listHo) {
            System.out.println(e);
        }
    }


}
