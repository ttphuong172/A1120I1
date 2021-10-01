package com.example.vacxin.service;

import com.example.vacxin.model.NguoiDan;

import java.util.List;

public interface NguoiDanService {
    List<NguoiDan> findAllByOrderByIdNguoiDanDesc();

    void saveNguoiDan(NguoiDan nguoiDan);
}
