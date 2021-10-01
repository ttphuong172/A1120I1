package com.example.sklcsvc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ThietBi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idThietBi;
    private String serialThietBi;
    private String tenThietBi;
    private String maThietBi;


    @ManyToOne
    @JoinColumn(name = "idHangSanXuat",referencedColumnName = "idHangSanXuat")
    @JsonBackReference
    private HangSanXuat hangSanXuat;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="idViTri",referencedColumnName = "idViTri")
    private ViTri viTri;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate ngayTrangBi;

    public ThietBi() {
    }

    public ThietBi(int idThietBi, String serialThietBi, String tenThietBi, String maThietBi, HangSanXuat hangSanXuat, ViTri viTri, LocalDate ngayTrangBi) {
        this.idThietBi = idThietBi;
        this.serialThietBi = serialThietBi;
        this.tenThietBi = tenThietBi;
        this.maThietBi = maThietBi;

        this.hangSanXuat = hangSanXuat;
        this.viTri = viTri;
        this.ngayTrangBi = ngayTrangBi;
    }

    public int getIdThietBi() {
        return idThietBi;
    }

    public void setIdThietBi(int idThietBi) {
        this.idThietBi = idThietBi;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getSerialThietBi() {
        return serialThietBi;
    }

    public void setSerialThietBi(String serialThietBi) {
        this.serialThietBi = serialThietBi;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public LocalDate getNgayTrangBi() {
        return ngayTrangBi;
    }

    public void setNgayTrangBi(LocalDate ngayTrangBi) {
        this.ngayTrangBi = ngayTrangBi;
    }



    public String getMaThietBi() {
        return maThietBi;
    }

    public void setMaThietBi(String maThietBi) {
        this.maThietBi = maThietBi;
    }
}
