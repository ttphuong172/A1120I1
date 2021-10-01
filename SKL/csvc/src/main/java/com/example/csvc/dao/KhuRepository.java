package com.example.csvc.dao;

import com.example.csvc.model.Khu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KhuRepository extends JpaRepository<Khu,Integer> {
    List<Khu> findAllByCoSo_IdCoso(int idCoSo);
}
