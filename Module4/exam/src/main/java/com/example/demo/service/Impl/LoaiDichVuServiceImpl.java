package com.example.demo.service.Impl;

import com.example.demo.dao.LoaiDichVuRepository;
import com.example.demo.model.LoaiDichVu;
import com.example.demo.service.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiDichVuServiceImpl implements LoaiDichVuService {
    @Autowired
    private LoaiDichVuRepository loaiDichVuRepository;
    @Override
    public List<LoaiDichVu> selectAllLoaiDichVu() {
        return loaiDichVuRepository.findAll();
    }
}
