package model;

public class DanhMuc {
    private int idDanhMuc;
    private String tenDanhMuc;

    public DanhMuc(int idDanhMuc, String tenDanhMuc) {
        this.idDanhMuc = idDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }

    public DanhMuc() {
    }

    public int getIdDanhMuc() {
        return idDanhMuc;
    }

    public void setIdDanhMuc(int idDanhMuc) {
        this.idDanhMuc = idDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    @Override
    public String toString() {
        return "DanhMuc{" +
                "idDanhMuc=" + idDanhMuc +
                ", tenDanhMuc='" + tenDanhMuc + '\'' +
                '}';
    }
}
