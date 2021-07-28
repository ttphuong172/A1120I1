package com.phuongtt.sanpham.repository;

import com.phuongtt.sanpham.model.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DanhMucRepository extends JpaRepository<DanhMuc,Integer> {
    List<DanhMuc> findByTenDanhMucContaining(String tendanhmuc);
}
