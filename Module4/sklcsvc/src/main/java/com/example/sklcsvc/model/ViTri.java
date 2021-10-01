package com.example.sklcsvc.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import java.util.List;

@Entity
public class ViTri implements Validator,Comparable<ViTri> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViTri;
    private String tenViTri;
    private String maViTri;

    @ManyToOne
    @JoinColumn(name = "idKhu",referencedColumnName = "idKhu")
    private Khu khu;

    @OneToMany (mappedBy = "viTri")
    List<ThietBi> thietBiList;

    public ViTri() {
    }

    public ViTri(int idViTri, String tenViTri, String maViTri, Khu khu, List<ThietBi> thietBiList) {
        this.idViTri = idViTri;
        this.tenViTri = tenViTri;
        this.maViTri = maViTri;
        this.khu = khu;
        this.thietBiList = thietBiList;
    }

    public int getIdViTri() {
        return idViTri;
    }

    public void setIdViTri(int idViTri) {
        this.idViTri = idViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public Khu getKhu() {
        return khu;
    }

    public void setKhu(Khu khu) {
        this.khu = khu;
    }

    public List<ThietBi> getThietBiList() {
        return thietBiList;
    }

    public void setThietBiList(List<ThietBi> thietBiList) {
        this.thietBiList = thietBiList;
    }

    public String getMaViTri() {
        return maViTri;
    }

    public void setMaViTri(String maViTri) {
        this.maViTri = maViTri;
    }

    @Override
    public int compareTo(ViTri o) {
        return this.maViTri.compareTo(o.maViTri);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
