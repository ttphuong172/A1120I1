package com.example.casestudy.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Quyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String tenQuyen;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "taikhoan_quyen",
            joinColumns = @JoinColumn(name = "quyen_id"), inverseJoinColumns = @JoinColumn(name = "taikhoan_id")
    )
    List<TaiKhoan> taiKhoanList;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTenQuyen() {
        return tenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        this.tenQuyen = tenQuyen;
    }

    public List<TaiKhoan> getTaiKhoanList() {
        return taiKhoanList;
    }

    public void setTaiKhoanList(List<TaiKhoan> taiKhoanList) {
        this.taiKhoanList = taiKhoanList;
    }


    @Override
    public String toString() {
        return "Quyen{" +
                "Id=" + Id +
                ", tenQuyen='" + tenQuyen + '\'' +
                '}';
    }
}
