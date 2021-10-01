package com.example.hokhau.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuanHe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quanHeId;
    private String quanHeTen;

    @OneToMany(mappedBy = "quanHe")
    List<NhanKhau> nhanKhauList;

    public QuanHe() {
    }

    public QuanHe(int quanHeId, String quanHeTen, List<NhanKhau> nhanKhauList) {
        this.quanHeId = quanHeId;
        this.quanHeTen = quanHeTen;
        this.nhanKhauList = nhanKhauList;
    }

    public int getQuanHeId() {
        return quanHeId;
    }

    public void setQuanHeId(int quanHeId) {
        this.quanHeId = quanHeId;
    }

    public String getQuanHeTen() {
        return quanHeTen;
    }

    public void setQuanHeTen(String quanHeTen) {
        this.quanHeTen = quanHeTen;
    }

    public List<NhanKhau> getNhanKhauList() {
        return nhanKhauList;
    }

    public void setNhanKhauList(List<NhanKhau> nhanKhauList) {
        this.nhanKhauList = nhanKhauList;
    }
}
