package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class GiaoDich implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maGiaoDich;

    @ManyToOne
    @JoinColumn(name = "maKhachHang",referencedColumnName = "maKhachHang")
    private KhachHang khachHang;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull (message = "Ngay giao dich khong duoc de trong")
    private LocalDate ngayGiaoDich;

    @ManyToOne
    @JoinColumn(name = "idLoaiDichVu",referencedColumnName = "idLoaiDichVu")
    private LoaiDichVu loaiDichVu;

    private int donGia;
    private double dienTich;

    public GiaoDich() {
    }

    public GiaoDich(int maGiaoDich, KhachHang khachHang, LocalDate ngayGiaoDich, LoaiDichVu loaiDichVu, int donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.khachHang = khachHang;
        this.ngayGiaoDich = ngayGiaoDich;
        this.loaiDichVu = loaiDichVu;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public LoaiDichVu getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        GiaoDich giaoDich = (GiaoDich) target;
        if(giaoDich.dienTich<21){
            errors.rejectValue("dienTich",null,"Dien tich phai lon hon 20m2");
        }
        if(giaoDich.donGia<500000){
            errors.rejectValue("donGia",null,"Don gia phai lon hon 500000");
        }
        if (giaoDich.ngayGiaoDich!=null){
            if (giaoDich.ngayGiaoDich.isBefore(LocalDate.now())){
                errors.rejectValue("ngayGiaoDich",null,"Ngay giao dich phai lon hon ngay hien tai");
            }
        }
    }
}
