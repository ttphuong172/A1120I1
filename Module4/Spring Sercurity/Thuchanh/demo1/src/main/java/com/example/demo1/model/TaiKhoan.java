package com.example.demo1.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String username;
    private String password;
    private boolean enabled;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "taikhoan_quyen",
            joinColumns = @JoinColumn(name = "taikhoan_id"), inverseJoinColumns = @JoinColumn(name = "quyen_id")
    )
    List<Quyen> quyenList;

    public TaiKhoan() {
    }

    public TaiKhoan(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Quyen> getQuyenList() {
        return quyenList;
    }

    public void setQuyenList(List<Quyen> quyenList) {
        this.quyenList = quyenList;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", quyenList=" + quyenList +
                '}';
    }
}

