package com.example.sklcsvc.service.Impl;

import com.example.csvc.dao.KhuRepository;
import com.example.csvc.model.Khu;
import com.example.csvc.service.KhuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuServiceImpl implements KhuService {
    @Autowired
    private KhuRepository khuRepository;
    @Override
    public List<Khu> selectAllKhu() {
        return khuRepository.findAll();
    }

    @Override
    public Khu findKhuById(int idKhu) {
        return khuRepository.findById(idKhu).orElse(null);
    }

    @Override
    public void saveKhu(Khu khu) {
        khuRepository.save(khu);
    }
}
