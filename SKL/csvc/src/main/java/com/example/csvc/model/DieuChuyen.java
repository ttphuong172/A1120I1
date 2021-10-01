package com.example.csvc.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class DieuChuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDieuChuyen;

    @ManyToOne
    @JoinColumn(name = "idThietBi",referencedColumnName = "idThietBi")
    private ThietBi thietBi;

    private String tenCoSoCu;
    private String tenKhuCu;
    private String tenViTriCu;

    private String tenCoSoMoi;
    private String tenKhuMoi;
    private String tenViTriMoi;
    private LocalDate ngayDieuChuyen;

    public DieuChuyen() {
    }

    public DieuChuyen(ThietBi thietBi, String tenCoSoCu, String tenKhuCu, String tenViTriCu, String tenCoSoMoi, String tenKhuMoi, String tenViTriMoi, LocalDate ngayDieuChuyen) {
        this.thietBi = thietBi;
        this.tenCoSoCu = tenCoSoCu;
        this.tenKhuCu = tenKhuCu;
        this.tenViTriCu = tenViTriCu;
        this.tenCoSoMoi = tenCoSoMoi;
        this.tenKhuMoi = tenKhuMoi;
        this.tenViTriMoi = tenViTriMoi;
        this.ngayDieuChuyen = ngayDieuChuyen;
    }

    public DieuChuyen(int idDieuChuyen, ThietBi thietBi, String tenCoSoCu, String tenKhuCu, String tenViTriCu, String tenCoSoMoi, String tenKhuMoi, String tenViTriMoi, LocalDate ngayDieuChuyen) {
        this.idDieuChuyen = idDieuChuyen;
        this.thietBi = thietBi;
        this.tenCoSoCu = tenCoSoCu;
        this.tenKhuCu = tenKhuCu;
        this.tenViTriCu = tenViTriCu;
        this.tenCoSoMoi = tenCoSoMoi;
        this.tenKhuMoi = tenKhuMoi;
        this.tenViTriMoi = tenViTriMoi;
        this.ngayDieuChuyen = ngayDieuChuyen;
    }

    public int getIdDieuChuyen() {
        return idDieuChuyen;
    }

    public void setIdDieuChuyen(int idDieuChuyen) {
        this.idDieuChuyen = idDieuChuyen;
    }

    public ThietBi getThietBi() {
        return thietBi;
    }

    public void setThietBi(ThietBi thietBi) {
        this.thietBi = thietBi;
    }

    public String getTenViTriCu() {
        return tenViTriCu;
    }

    public void setTenViTriCu(String tenViTriCu) {
        this.tenViTriCu = tenViTriCu;
    }

    public String getTenViTriMoi() {
        return tenViTriMoi;
    }

    public void setTenViTriMoi(String tenViTriMoi) {
        this.tenViTriMoi = tenViTriMoi;
    }

    public LocalDate getNgayDieuChuyen() {
        return ngayDieuChuyen;
    }

    public void setNgayDieuChuyen(LocalDate ngayDieuChuyen) {
        this.ngayDieuChuyen = ngayDieuChuyen;
    }

    public String getTenCoSoCu() {
        return tenCoSoCu;
    }

    public void setTenCoSoCu(String tenCoSoCu) {
        this.tenCoSoCu = tenCoSoCu;
    }

    public String getTenKhuCu() {
        return tenKhuCu;
    }

    public void setTenKhuCu(String tenKhuCu) {
        this.tenKhuCu = tenKhuCu;
    }

    public String getTenCoSoMoi() {
        return tenCoSoMoi;
    }

    public void setTenCoSoMoi(String tenCoSoMoi) {
        this.tenCoSoMoi = tenCoSoMoi;
    }

    public String getTenKhuMoi() {
        return tenKhuMoi;
    }

    public void setTenKhuMoi(String tenKhuMoi) {
        this.tenKhuMoi = tenKhuMoi;
    }
}
