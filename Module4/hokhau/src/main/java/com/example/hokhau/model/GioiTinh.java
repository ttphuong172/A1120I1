package com.example.hokhau.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class GioiTinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gioiTinhId;
    private String gioiTinhTen;
    @OneToMany(mappedBy = "gioiTinh")
    List<NhanKhau> nhanKhauList;

    public GioiTinh() {
    }

    public GioiTinh(int gioiTinhId, String gioiTinhTen) {
        this.gioiTinhId = gioiTinhId;
        this.gioiTinhTen = gioiTinhTen;
    }

    public int getGioiTinhId() {
        return gioiTinhId;
    }

    public void setGioiTinhId(int gioiTinhId) {
        this.gioiTinhId = gioiTinhId;
    }

    public String getGioiTinhTen() {
        return gioiTinhTen;
    }

    public void setGioiTinhTen(String gioiTinhTen) {
        this.gioiTinhTen = gioiTinhTen;
    }
}
