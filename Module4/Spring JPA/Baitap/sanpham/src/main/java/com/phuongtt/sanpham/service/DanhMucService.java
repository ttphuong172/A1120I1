package com.phuongtt.sanpham.service;

import com.phuongtt.sanpham.model.DanhMuc;
import com.phuongtt.sanpham.model.SanPham;

import java.util.List;

public interface DanhMucService {
    List<DanhMuc> selectAllDanhMuc();
    DanhMuc findDanhMucById(int id);
    void saveDanhMuc(DanhMuc danhMuc);
    void removeDanhMuc(DanhMuc danhMuc);
    List<DanhMuc> findByTenDanhMucContaining(String tendanhmuc);
}
