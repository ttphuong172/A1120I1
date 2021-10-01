package com.example.csvc.service.Impl;

import com.example.csvc.dao.DieuChuyenRepository;
import com.example.csvc.model.DieuChuyen;
import com.example.csvc.service.DieuChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DieuChuyenServiceImpl implements DieuChuyenService {
    @Autowired
    private DieuChuyenRepository dieuChuyenRepository;
    @Override
    public void saveDieuChuyen(DieuChuyen dieuChuyen) {
        dieuChuyenRepository.save(dieuChuyen);
    }

    @Override
    public List<DieuChuyen> selectAllDieuChuyen() {
        return dieuChuyenRepository.findAll();
    }
}
