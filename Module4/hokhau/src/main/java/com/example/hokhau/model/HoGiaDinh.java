package com.example.hokhau.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"hoGiaDinhTen","soNha","duongId"}))
public class HoGiaDinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hoGiaDinhId;
    private String hoGiaDinhTen;
    private Integer soNha;

    @ManyToOne
    @JoinColumn(name = "duongId",referencedColumnName = "duongId")
    private Duong duong;

    @OneToMany (mappedBy = "hoGiaDinh")
    List<NhanKhau> nhanKhauList;



    public HoGiaDinh() {
    }

    public HoGiaDinh(int hoGiaDinhId, String hoGiaDinhTen, Integer soNha, Duong duong, List<NhanKhau> nhanKhauList) {
        this.hoGiaDinhId = hoGiaDinhId;
        this.hoGiaDinhTen = hoGiaDinhTen;
        this.soNha = soNha;
        this.duong = duong;
        this.nhanKhauList = nhanKhauList;
    }

    public int getHoGiaDinhId() {
        return hoGiaDinhId;
    }

    public void setHoGiaDinhId(int hoGiaDinhId) {
        this.hoGiaDinhId = hoGiaDinhId;
    }

    public String getHoGiaDinhTen() {
        return hoGiaDinhTen;
    }

    public void setHoGiaDinhTen(String hoGiaDinhTen) {
        this.hoGiaDinhTen = hoGiaDinhTen;
    }

    public Integer getSoNha() {
        return soNha;
    }

    public void setSoNha(Integer soNha) {
        this.soNha = soNha;
    }

    public Duong getDuong() {
        return duong;
    }

    public void setDuong(Duong duong) {
        this.duong = duong;
    }

    public List<NhanKhau> getNhanKhauList() {
        return nhanKhauList;
    }

    public void setNhanKhauList(List<NhanKhau> nhanKhauList) {
        this.nhanKhauList = nhanKhauList;
    }
}
