package com.example.sklcsvc.service;

import com.example.csvc.model.ViTri;

import java.util.List;

public interface ViTriService {
    List<ViTri> selectAllViTri();
    ViTri findViTriById(int idViTri);
    void saveViTri(ViTri viTri);
}
