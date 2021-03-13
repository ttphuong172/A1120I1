package _07_abstract_interface.homework.canbo;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String ten, int namSinh, boolean gioiTinh, String diaChi, String bac) {
        super(ten, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "CongNhan{" +
                "bac='" + bac + '\'' +
                '}';
    }
}
