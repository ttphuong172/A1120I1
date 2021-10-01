package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class LoaiDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLoaiDichVu;
    private String tenLoaiDichVu;
    @OneToMany(mappedBy = "loaiDichVu")
    List<GiaoDich> giaoDichList;

    public LoaiDichVu() {
    }

    public LoaiDichVu(int idLoaiDichVu, String tenLoaiDichVu, List<GiaoDich> giaoDichList) {
        this.idLoaiDichVu = idLoaiDichVu;
        this.tenLoaiDichVu = tenLoaiDichVu;
        this.giaoDichList = giaoDichList;
    }

    public int getIdLoaiDichVu() {
        return idLoaiDichVu;
    }

    public void setIdLoaiDichVu(int idLoaiDichVu) {
        this.idLoaiDichVu = idLoaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public List<GiaoDich> getGiaoDichList() {
        return giaoDichList;
    }

    public void setGiaoDichList(List<GiaoDich> giaoDichList) {
        this.giaoDichList = giaoDichList;
    }
}
