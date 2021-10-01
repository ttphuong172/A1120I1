package com.example.csvc.service;

import com.example.csvc.model.DieuChuyen;

import java.util.List;

public interface DieuChuyenService {
    void saveDieuChuyen(DieuChuyen dieuChuyen);
    List<DieuChuyen> selectAllDieuChuyen();
}
