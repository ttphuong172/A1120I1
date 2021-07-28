package com.phuongtt.sanpham.model;

import javax.persistence.*;


@Entity(name = "sanpham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ten", length = 50)
    private String ten;
    @Column(name = "gia")
    private int gia;
    @Column(name = "soluong")
    private int soLuong;
    @Column(name = "mausac")
    private String mauSac;
    @Column(name = "mota")
    private String moTa;

    @ManyToOne
    @JoinColumn(name="iddanhmuc",referencedColumnName = "id")
    private DanhMuc danhMuc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
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

    public SanPham() {
    }

    public SanPham(int id, String ten, int gia, int soLuong, String mauSac, String moTa) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
    }

    public SanPham(String ten, int gia, int soLuong, String mauSac, String moTa) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mauSac = mauSac;
        this.moTa = moTa;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }
}
