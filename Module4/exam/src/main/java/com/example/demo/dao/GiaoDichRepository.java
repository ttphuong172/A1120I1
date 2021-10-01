package com.example.demo.dao;

import com.example.demo.model.GiaoDich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GiaoDichRepository extends JpaRepository<GiaoDich,Integer> {
    @Query("select g from GiaoDich g WHERE (g.khachHang.tenKhachHang like %:tenKhachHang%) and (:idLoaiDichVu is null or g.loaiDichVu.idLoaiDichVu=:idLoaiDichVu)")
    List<GiaoDich> findTenKHAndLoaiDV(@Param("tenKhachHang") String tenKhachHang,  Optional<Integer> idLoaiDichVu);
}
