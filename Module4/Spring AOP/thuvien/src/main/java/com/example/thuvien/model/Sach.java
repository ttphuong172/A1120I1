package com.example.thuvien.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="tensach")
    private String tenSach;
    @Column(name = "soluong")
    private int soLuong;
    @OneToMany(mappedBy = "sach")
    List<MuonTraSach> muonTraSachList;

    public Sach() {
    }

    public Sach(int id, String tenSach, int soLuong) {
        this.id = id;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
