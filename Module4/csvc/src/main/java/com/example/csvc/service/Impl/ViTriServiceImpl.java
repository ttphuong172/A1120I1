package com.example.csvc.service.Impl;

import com.example.csvc.dao.ViTriRepository;
import com.example.csvc.model.ViTri;
import com.example.csvc.service.ViTriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViTriServiceImpl implements ViTriService {
    @Autowired
    private ViTriRepository viTriRepository;

    @Override
    public List<ViTri> selectAllViTri() {
        return viTriRepository.findAll();
    }

    @Override
    public ViTri findViTriById(int idViTri) {
        return viTriRepository.findById(idViTri).orElse(null);
    }

    @Override
    public void saveViTri(ViTri viTri) {
        viTriRepository.save(viTri);
    }
}
