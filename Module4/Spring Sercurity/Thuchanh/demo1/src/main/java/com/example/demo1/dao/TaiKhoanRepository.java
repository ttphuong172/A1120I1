package com.example.demo1.dao;

import com.example.demo1.model.Quyen;
import com.example.demo1.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TaiKhoanRepository extends JpaRepository<TaiKhoan,Integer>  {
    TaiKhoan findByUsername(String username);


}
