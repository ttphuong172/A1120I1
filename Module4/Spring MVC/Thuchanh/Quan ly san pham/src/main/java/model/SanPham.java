package model;

public class SanPham {
    private int id;
    private String tenSanPham;
    private int giaSanPham;
    private int soLuong;
    private String mauSac;
    private String moTa;
    private DanhMuc danhMuc;

    public SanPham(int id, String tenSanPham, int giaSanPham, int soLuong, String mauSac, String moTa, DanhMuc danhMuc) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.danhMuc = danhMuc;
    }

    public SanPham(String tenSanPham, int giaSanPham, int soLuong, String mauSac, String moTa, DanhMuc danhMuc) {
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
        this.danhMuc = danhMuc;
    }

    public SanPham() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(int giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }
}
