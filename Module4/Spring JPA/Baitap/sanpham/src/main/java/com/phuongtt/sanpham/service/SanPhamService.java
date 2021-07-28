package com.phuongtt.sanpham.service;

import com.phuongtt.sanpham.model.SanPham;

import java.util.List;

public interface SanPhamService {
    List<SanPham> selectAllSanPham();
    SanPham findSanPhamById(int id);
    void saveSanPham(SanPham sanPham);
    void removeSanPham(SanPham sanPham);
    List<SanPham> findByTenContaining(String ten);
}
