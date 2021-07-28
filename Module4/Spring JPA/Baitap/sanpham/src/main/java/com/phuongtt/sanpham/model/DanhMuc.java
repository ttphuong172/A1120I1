package com.phuongtt.sanpham.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "danhmuc")

public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "tendanhmuc")
    private String tenDanhMuc;

    @OneToMany(mappedBy = "danhMuc")
    private List<SanPham> sanPhamList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public DanhMuc() {
    }

    public DanhMuc(int id, String tenDanhMuc) {
        this.id = id;
        this.tenDanhMuc = tenDanhMuc;
    }

    public DanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }



    @Override
    public String toString() {
        return "DanhMuc{" +
                "id=" + id +
                ", tenDanhMuc='" + tenDanhMuc + '\'' +
                ", sanPhamList=" + sanPhamList +
                '}';
    }
}
