package com.example.hokhau.service;

import com.example.hokhau.dao.DuongRepository;
import com.example.hokhau.model.Duong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DuongServiceImpl implements DuongService {
    @Autowired
    private DuongRepository duongRepository;
    @Override
    public List<Duong> selectAllDuong() {
        return duongRepository.findAll();
    }
}
