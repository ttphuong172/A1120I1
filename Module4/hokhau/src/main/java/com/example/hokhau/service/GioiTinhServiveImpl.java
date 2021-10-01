package com.example.hokhau.service;

import com.example.hokhau.dao.GioiTinhRepository;
import com.example.hokhau.model.GioiTinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioiTinhServiveImpl implements GioiTinhService {
    @Autowired
    private GioiTinhRepository gioiTinhRepository;

    @Override
    public List<GioiTinh> selectAllGioiTinh() {
        return gioiTinhRepository.findAll();
    }
}
