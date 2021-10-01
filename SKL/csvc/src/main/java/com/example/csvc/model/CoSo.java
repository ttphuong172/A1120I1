package com.example.csvc.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class CoSo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCoso;
    private String tenCoso;
    @OneToMany (mappedBy = "coSo")
    List<Khu> khuList;

    public CoSo() {
    }

    public CoSo(int idCoso, String tenCoso, List<Khu> khuList) {
        this.idCoso = idCoso;
        this.tenCoso = tenCoso;
        this.khuList = khuList;
    }

    public int getIdCoso() {
        return idCoso;
    }

    public void setIdCoso(int idCoso) {
        this.idCoso = idCoso;
    }

    public String getTenCoso() {
        return tenCoso;
    }

    public void setTenCoso(String tenCoso) {
        this.tenCoso = tenCoso;
    }

    public List<Khu> getKhuList() {
        return khuList;
    }

    public void setKhuList(List<Khu> khuList) {
        this.khuList = khuList;
    }
}
