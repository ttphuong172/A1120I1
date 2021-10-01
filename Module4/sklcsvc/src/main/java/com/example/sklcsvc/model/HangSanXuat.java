package com.example.sklcsvc.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class HangSanXuat {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idHangSanXuat;
    private String tenHangSanXuat;
    @OneToMany (mappedBy = "hangSanXuat")
    List<ThietBi> thietBiList;

    public HangSanXuat() {
    }

    public HangSanXuat(int idHangSanXuat, String tenHangSanXuat, List<ThietBi> thietBiList) {
        this.idHangSanXuat = idHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.thietBiList = thietBiList;
    }

    public int getIdHangSanXuat() {
        return idHangSanXuat;
    }

    public void setIdHangSanXuat(int idHangSanXuat) {
        this.idHangSanXuat = idHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public List<ThietBi> getThietBiList() {
        return thietBiList;
    }

    public void setThietBiList(List<ThietBi> thietBiList) {
        this.thietBiList = thietBiList;
    }
}
