package com.example.csvc.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Khu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idKhu;
    private String tenKhu;
    @ManyToOne
    @JoinColumn(name="idCoso",referencedColumnName = "idCoso")
    private CoSo coSo;

    @OneToMany(mappedBy = "khu")
    List<ViTri> viTriList;

    public Khu() {
    }

    public Khu(int idKhu, String tenKhu, CoSo coSo, List<ViTri> viTriList) {
        this.idKhu = idKhu;
        this.tenKhu = tenKhu;
        this.coSo = coSo;
        this.viTriList = viTriList;
    }

    public int getIdKhu() {
        return idKhu;
    }

    public void setIdKhu(int idKhu) {
        this.idKhu = idKhu;
    }

    public String getTenKhu() {
        return tenKhu;
    }

    public void setTenKhu(String tenKhu) {
        this.tenKhu = tenKhu;
    }

    public CoSo getCoSo() {
        return coSo;
    }

    public void setCoSo(CoSo coSo) {
        this.coSo = coSo;
    }

    public List<ViTri> getViTriList() {
        return viTriList;
    }

    public void setViTriList(List<ViTri> viTriList) {
        this.viTriList = viTriList;
    }
}
