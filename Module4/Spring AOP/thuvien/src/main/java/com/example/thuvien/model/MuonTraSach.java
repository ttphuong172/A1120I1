package com.example.thuvien.model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class MuonTraSach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ngaymuon")
    private LocalDateTime ngayMuon;
    @Column(name = "ngaytra")
    private LocalDateTime ngayTra;
    @Column(name = "mamuontrasach")
    private String maMuonTraSach;

    @ManyToOne
    @JoinColumn (name ="idsach",referencedColumnName = "id")
    private Sach sach;

    public MuonTraSach() {
    }

    public MuonTraSach(int id, LocalDateTime ngayMuon, LocalDateTime ngayTra, Sach sach) {
        this.id = id;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.sach = sach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDateTime ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalDateTime getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDateTime ngayTra) {
        this.ngayTra = ngayTra;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public String getMaMuonTraSach() {
        return maMuonTraSach;
    }

    public void setMaMuonTraSach(String maMuonTraSach) {
        this.maMuonTraSach = maMuonTraSach;
    }
}
