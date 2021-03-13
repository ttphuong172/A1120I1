package _07_abstract_interface.homework.canbo;

public class PhucVu extends CanBo {
    private String congViec;

    public PhucVu() {
    }

    public PhucVu(String ten, int namSinh, boolean gioiTinh, String diaChi, String congViec) {
        super(ten, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + "PhucVu{" +
                "congViec='" + congViec + '\'' +
                '}';
    }
}


