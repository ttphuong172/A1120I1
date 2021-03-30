package _07_abstract_interface.homework.library;

import java.util.ArrayList;

public class QLTV {
    ArrayList<TaiLieu> danhSachTaiLieu=new ArrayList<>();
    public void themMoiTaiLieu(TaiLieu taiLieu){
        danhSachTaiLieu.add(taiLieu);
    }
    public void hienThiTaiLieu(){
    for (TaiLieu taiLieu:danhSachTaiLieu){
        System.out.println(taiLieu);
    }
    }

    public void timTaiLieu(){
      for (TaiLieu taiLieu:danhSachTaiLieu){
          if (taiLieu instanceof Sach){
              System.out.println(taiLieu);
          }
      }
    }

}
