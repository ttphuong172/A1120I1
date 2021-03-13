package _07_abstract_interface.homework.canbo;

import java.util.ArrayList;

public class QLCB {
    ArrayList<KySu> danhSachKySu = new ArrayList<KySu>();
    ArrayList<CongNhan> danhSachCongNhan = new ArrayList<CongNhan>();
    ArrayList<PhucVu> danhSachPhucVu = new ArrayList<PhucVu>();

    public void themKySu(KySu kySu) {
        danhSachKySu.add(kySu);
    }
    public void themCongNhan(CongNhan congNhan){
        danhSachCongNhan.add(congNhan);
    }
    public void themPhucVu(PhucVu phucVu){
        danhSachPhucVu.add(phucVu);
    }


}
