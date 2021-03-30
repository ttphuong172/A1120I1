package _07_abstract_interface.homework.library;

public abstract class TaiLieu {
    private int maTaiLieu;
    private String nhaPhatHanh;
    private int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(int maTaiLieu, String nhaPhatHanh, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaPhatHanh = nhaPhatHanh;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaPhatHanh() {
        return nhaPhatHanh;
    }

    public void setNhaPhatHanh(String nhaPhatHanh) {
        this.nhaPhatHanh = nhaPhatHanh;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu=" + maTaiLieu +
                ", nhaPhatHanh='" + nhaPhatHanh + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
