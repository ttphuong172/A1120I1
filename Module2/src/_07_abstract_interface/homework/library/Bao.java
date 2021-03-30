package _07_abstract_interface.homework.library;

import java.util.Date;

public class Bao extends TaiLieu {
    String ngayPhatHanh;

    public Bao(int maTaiLieu, String nhaPhatHanh, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, nhaPhatHanh, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

}
