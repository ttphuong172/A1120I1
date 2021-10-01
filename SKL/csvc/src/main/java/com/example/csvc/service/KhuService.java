package com.example.csvc.service;

import com.example.csvc.model.Khu;

import java.util.List;

public interface KhuService {
    List<Khu> selectAllKhu ();
    Khu findKhuById(int idKhu);
    void saveKhu(Khu khu);
    List<Khu> findAllByCoSo_IdCoso(int idCoSo);
}
