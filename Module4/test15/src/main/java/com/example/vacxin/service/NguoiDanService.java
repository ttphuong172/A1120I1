package com.example.vacxin.service;

import com.example.vacxin.model.NguoiDan;

import java.util.List;

public interface NguoiDanService {
    List<NguoiDan> findAllByOrderByIdNguoiDanDesc();
    NguoiDan findNguoiDanById(int idNguoiDan);
    void saveNguoiDan(NguoiDan nguoiDan);
}
