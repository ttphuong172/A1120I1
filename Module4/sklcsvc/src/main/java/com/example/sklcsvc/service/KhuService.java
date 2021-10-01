package com.example.sklcsvc.service;

import com.example.csvc.model.Khu;

import java.util.List;

public interface KhuService {
    List<Khu> selectAllKhu ();
    Khu findKhuById(int idKhu);
    void saveKhu(Khu khu);
}
