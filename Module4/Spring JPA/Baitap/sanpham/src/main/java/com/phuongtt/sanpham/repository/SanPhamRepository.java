package com.phuongtt.sanpham.repository;

import com.phuongtt.sanpham.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SanPhamRepository extends JpaRepository<SanPham,Integer> {
    List<SanPham> findByTenContaining(String ten);
}
