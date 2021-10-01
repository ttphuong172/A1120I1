package com.example.vacxin.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Duong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDuong;
    private String tenDuong;
    @OneToMany(mappedBy = "duong")
    List<NguoiDan> nguoiDanList;

    public Duong() {
    }

    public Duong(int idDuong, String tenDuong, List<NguoiDan> nguoiDanList) {
        this.idDuong = idDuong;
        this.tenDuong = tenDuong;
        this.nguoiDanList = nguoiDanList;
    }

    public int getIdDuong() {
        return idDuong;
    }

    public void setIdDuong(int idDuong) {
        this.idDuong = idDuong;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public List<NguoiDan> getNguoiDanList() {
        return nguoiDanList;
    }

    public void setNguoiDanList(List<NguoiDan> nguoiDanList) {
        this.nguoiDanList = nguoiDanList;
    }
}
