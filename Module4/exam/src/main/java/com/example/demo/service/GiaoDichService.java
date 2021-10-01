package com.example.demo.service;

import com.example.demo.model.GiaoDich;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface GiaoDichService {
    List<GiaoDich> selectAllGiaoDich();
    void saveGiaoDich (GiaoDich giaoDich);
    GiaoDich findGiaoDichById(int maGiaoDich);
    void    deleteGiaoDich(GiaoDich giaoDich);
    List<GiaoDich> findTenKHAndLoaiDV(String tenKhachHang, Optional<Integer> idLoaiDichVu);
}
