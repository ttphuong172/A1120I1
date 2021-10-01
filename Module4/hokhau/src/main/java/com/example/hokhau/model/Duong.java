package com.example.hokhau.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Duong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int duongId;
    private String tenDuong;
    @OneToMany(mappedBy = "duong")
    List<HoGiaDinh> hoGiaDinhList;

    public Duong() {
    }

    public Duong(int duongId, String tenDuong, List<HoGiaDinh> hoGiaDinhList) {
        this.duongId = duongId;
        this.tenDuong = tenDuong;
        this.hoGiaDinhList = hoGiaDinhList;
    }

    public int getDuongId() {
        return duongId;
    }

    public void setDuongId(int duongId) {
        this.duongId = duongId;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public List<HoGiaDinh> getHoGiaDinhList() {
        return hoGiaDinhList;
    }

    public void setHoGiaDinhList(List<HoGiaDinh> hoGiaDinhList) {
        this.hoGiaDinhList = hoGiaDinhList;
    }
}
