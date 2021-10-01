package com.example.vacxin.dao;

import com.example.vacxin.model.NguoiDan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NguoiDanRepository extends JpaRepository<NguoiDan, Integer> {
    List<NguoiDan> findAllByOrderByIdNguoiDanDesc();
}
