package com.example.hokhau.service;

import com.example.hokhau.dao.QuanHeRepository;
import com.example.hokhau.model.QuanHe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuanHeServiceImpl implements QuanHeService {
    @Autowired
    private QuanHeRepository quanHeRepository;

    @Override
    public List<QuanHe> selectAllQuanHe() {
        return quanHeRepository.findAll();
    }
}
