package com.example.csvc.dao;

import com.example.csvc.model.ViTri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ViTriRepository extends JpaRepository<ViTri,Integer> {
    List<ViTri> findAllByKhu_IdKhu(int idKhu);

}
