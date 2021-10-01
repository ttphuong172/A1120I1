package com.example.hokhau.model;

import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"hoTen", "ngaySinh", "hoGiaDinhId"}))
public class NhanKhau implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nhanKhauId;
    @NotBlank (message = "không được để trống")
    private String hoTen;
    @NotNull (message = "không được để trống")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate ngaySinh;

    @NotNull (message = "không được để trống")
    @ManyToOne
    @JoinColumn(name = "hoGiaDinhId", referencedColumnName = "hoGiaDinhId")
    private HoGiaDinh hoGiaDinh;

    @NotNull (message = "không được để trống")
    @ManyToOne
    @JoinColumn(name = "quanHeId", referencedColumnName = "quanHeId")
    private QuanHe quanHe;

    @NotNull (message = "không được để trống")
    @ManyToOne
    @JoinColumn(name = "gioiTinhId", referencedColumnName = "gioiTinhId")
    private GioiTinh gioiTinh;
    private String soDienThoai;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate vacxin1;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate vacxin2;
//    @Formula("YEAR(CURDATE()) - YEAR(ngay_sinh)")
    @Formula("floor(datediff(CURDATE(),ngay_sinh)/365)")
    private int age;

    public long nhanKhauTuoi(){
       return ChronoUnit.YEARS.between(ngaySinh, LocalDate.now()) ;
    }

    public NhanKhau() {
    }

    public NhanKhau(int nhanKhauId, @NotBlank String hoTen, @NotNull LocalDate ngaySinh, @NotNull HoGiaDinh hoGiaDinh, @NotNull QuanHe quanHe, @NotNull GioiTinh gioiTinh, String soDienThoai, LocalDate vacxin1, LocalDate vacxin2) {
        this.nhanKhauId = nhanKhauId;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hoGiaDinh = hoGiaDinh;
        this.quanHe = quanHe;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.vacxin1 = vacxin1;
        this.vacxin2 = vacxin2;
    }

    public NhanKhau(int nhanKhauId, @NotBlank(message = "không được để trống") String hoTen, @NotNull(message = "không được để trống") LocalDate ngaySinh, @NotNull(message = "không được để trống") HoGiaDinh hoGiaDinh, @NotNull(message = "không được để trống") QuanHe quanHe, @NotNull(message = "không được để trống") GioiTinh gioiTinh, String soDienThoai, LocalDate vacxin1, LocalDate vacxin2, int age) {
        this.nhanKhauId = nhanKhauId;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hoGiaDinh = hoGiaDinh;
        this.quanHe = quanHe;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.vacxin1 = vacxin1;
        this.vacxin2 = vacxin2;
        this.age = age;
    }

    public int getNhanKhauId() {
        return nhanKhauId;
    }

    public void setNhanKhauId(int nhanKhauId) {
        this.nhanKhauId = nhanKhauId;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public HoGiaDinh getHoGiaDinh() {
        return hoGiaDinh;
    }

    public void setHoGiaDinh(HoGiaDinh hoGiaDinh) {
        this.hoGiaDinh = hoGiaDinh;
    }

    public QuanHe getQuanHe() {
        return quanHe;
    }

    public void setQuanHe(QuanHe quanHe) {
        this.quanHe = quanHe;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LocalDate getVacxin1() {
        return vacxin1;
    }

    public void setVacxin1(LocalDate vacxin1) {
        this.vacxin1 = vacxin1;
    }

    public LocalDate getVacxin2() {
        return vacxin2;
    }

    public void setVacxin2(LocalDate vacxin2) {
        this.vacxin2 = vacxin2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        NhanKhau nhanKhau = (NhanKhau) target;
        LocalDate ngaySinh = nhanKhau.getNgaySinh();
        LocalDate vacxin1 = nhanKhau.getVacxin1();
        LocalDate vacxin2 = nhanKhau.getVacxin2();
        if (ngaySinh != null) {
            if (ngaySinh.isAfter(LocalDate.now())) {
                errors.rejectValue("ngaySinh", null, "ngày không được lớn hơn hiện tại");
            }
        }
        if (vacxin1 != null) {
            if (vacxin1.isAfter(LocalDate.now())) {
                errors.rejectValue("vacxin1", null, "ngày không được lớn hơn hiện tại");
            }
        }
        if (vacxin2 != null) {
            if (vacxin2.isAfter(LocalDate.now())) {
                errors.rejectValue("vacxin2", null, "ngày không được lớn hơn hiện tại");
            }
        }
        if(nhanKhau.getSoDienThoai().length()!=0){
            if (nhanKhau.getSoDienThoai().length()!=10){
                errors.rejectValue("soDienThoai", null, "số điện thoại không đúng");
            }

        }
        if (vacxin1 != null && vacxin2 != null) {
            if (vacxin1.isAfter(vacxin2)) {
                errors.rejectValue("vacxin2", null, "kiểm tra ngày chích vacxin lần 2");
            }
            if (ChronoUnit.DAYS.between(vacxin1, vacxin2) < 30) {
                errors.rejectValue("vacxin2", null, "lần tiêm vacxin lần 2 cách lần 1 nhỏ hơn 30 ngày ");
            }
        }
        if (nhanKhau.gioiTinh != null && nhanKhau.quanHe != null) {
            //Nam - Vo
            if (nhanKhau.gioiTinh.getGioiTinhId() == 1 && nhanKhau.quanHe.getQuanHeId() == 2) {
                errors.rejectValue("quanHe", null, "kiểm tra mối quan hệ và giới tính");
            }
            //Nu - Chong
            if (nhanKhau.gioiTinh.getGioiTinhId() == 2 && nhanKhau.quanHe.getQuanHeId() == 3) {
                errors.rejectValue("quanHe", null, "kiểm tra mối quan hệ và giới tính");
            }
        }

    }
}
