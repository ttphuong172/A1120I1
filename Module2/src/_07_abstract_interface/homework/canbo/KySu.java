package _07_abstract_interface.homework.canbo;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String ten, int namSinh, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(ten, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() + "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
