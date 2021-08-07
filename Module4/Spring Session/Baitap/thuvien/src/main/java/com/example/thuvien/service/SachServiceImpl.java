package com.example.thuvien.service;

import com.example.thuvien.dao.MuonTraSachRepository;
import com.example.thuvien.dao.SachRepository;
import com.example.thuvien.model.MuonTraSach;
import com.example.thuvien.model.Sach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class SachServiceImpl implements SachService {
    @Autowired
    private SachRepository sachRepository;
    @Autowired
    private MuonTraSachRepository muonTraSachRepository;

    @Override
    public List<Sach> selectAllSach() {
        return sachRepository.findAll();
    }

    @Override
    public Sach findSachById(int id) {
        return sachRepository.getById(id);
    }

    @Override
    public void saveSach(Sach sach) {
        sachRepository.save(sach);
    }




}
