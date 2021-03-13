package _07_abstract_interface.homework.canbo;

public abstract class CanBo {
    private String ten;
    private int namSinh;
    private boolean gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String ten, int namSinh, boolean gioiTinh, String diaChi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
