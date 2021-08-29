package com.example.demo1.config;

import com.example.demo1.dao.TaiKhoanRepository;
import com.example.demo1.model.TaiKhoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUserDetails implements UserDetails {

    private TaiKhoan taiKhoan;

    public MyUserDetails(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {


        List<GrantedAuthority> authorities= new ArrayList<>();
        for (int i=0;i<taiKhoan.getQuyenList().size();i++){
            String role=taiKhoan.getQuyenList().get(i).getTenQuyen();
            authorities.add(new SimpleGrantedAuthority(role));
        }

        return authorities;
    }

    @Override
    public String getPassword() {
        return taiKhoan.getPassword();
    }

    @Override
    public String getUsername() {
        return taiKhoan.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return taiKhoan.isEnabled();
    }
}
