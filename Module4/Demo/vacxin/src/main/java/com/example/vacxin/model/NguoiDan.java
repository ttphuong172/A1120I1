package com.example.vacxin.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
public class NguoiDan implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNguoiDan;
    @NotBlank(message = "Vui lòng nhập Họ và tên")
    private String ten;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "Ngày sinh không được để trống")
    private LocalDate ngaySinh;
    private int soNha;
    @ManyToOne
    @JoinColumn(name = "idDuong", referencedColumnName = "idDuong")
    private Duong duong;
    private String soCMND;
    private String soBHYT;
    private String soDienThoai;
    private String ngheNghiep;

    public NguoiDan() {
    }

    public NguoiDan(int idNguoiDan, String ten, LocalDate ngaySinh, int soNha, Duong duong, String soCMND, String soBHYT, String soDienThoai, String ngheNghiep) {
        this.idNguoiDan = idNguoiDan;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soNha = soNha;
        this.duong = duong;
        this.soCMND = soCMND;
        this.soBHYT = soBHYT;
        this.soDienThoai = soDienThoai;
        this.ngheNghiep = ngheNghiep;
    }

    public int getIdNguoiDan() {
        return idNguoiDan;
    }

    public void setIdNguoiDan(int idNguoiDan) {
        this.idNguoiDan = idNguoiDan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public Duong getDuong() {
        return duong;
    }

    public void setDuong(Duong duong) {
        this.duong = duong;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoBHYT() {
        return soBHYT;
    }

    public void setSoBHYT(String soBHYT) {
        this.soBHYT = soBHYT;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        NguoiDan nguoiDan = (NguoiDan) target;

        if (nguoiDan.getDuong() == null) {
            errors.rejectValue("duong", null, "Vui lòng chọn tên đường");
        }
        if (nguoiDan.soCMND.length() != 9 && nguoiDan.soCMND.length() != 12) {
            errors.rejectValue("soCMND", null, "Sai định đạng số CMND");
        }
        if (nguoiDan.soDienThoai.length() != 10) {
            errors.rejectValue("soDienThoai", null, "Sai định dạng số điện thoại");
        }
        if (nguoiDan.ngaySinh != null) {
            if (ChronoUnit.YEARS.between(nguoiDan.ngaySinh, LocalDate.now()) < 18) {
                errors.rejectValue("ngaySinh", null, "Chưa đủ 18 tuổi để tiêm vacxin");
            }
        }
    }
}
