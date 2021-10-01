package com.example.csvc.service.Impl;

import com.example.csvc.dao.ThietBiRepository;
import com.example.csvc.model.ThietBi;
import com.example.csvc.service.ThietBiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThietBiServiceImpl implements ThietBiService {
    @Autowired
    private ThietBiRepository thietBiRepository;
    @Override
    public List<ThietBi> selectAllThietBi() {
        return thietBiRepository.findAll();
    }

    @Override
    public void saveThietBi(ThietBi thietBi) {
        thietBiRepository.save(thietBi);
    }

    @Override
    public ThietBi findThietBiById(int idThietBi) {
        return thietBiRepository.findById(idThietBi).orElse(null);
    }

    @Override
    public void deleteThietBi(ThietBi thietBi) {
        thietBiRepository.delete(thietBi);
    }
}
