package model;

public class ThueNha {
    private String id;
    private String ngayBatDau;
    private String ngayKetThuc;
    private int giaChoThue;
    private int dienTich;

    public ThueNha(String id, String ngayBatDau, String ngayKetThuc, int giaChoThue, int dienTich) {
        this.id = id;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giaChoThue = giaChoThue;
        this.dienTich = dienTich;
    }

    public ThueNha(String ngayBatDau, String ngayKetThuc, int giaChoThue) {
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giaChoThue = giaChoThue;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getGiaChoThue() {
        return giaChoThue;
    }

    public void setGiaChoThue(int giaChoThue) {
        this.giaChoThue = giaChoThue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }
}
