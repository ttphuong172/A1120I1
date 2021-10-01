package com.example.csvc.service.Impl;

import com.example.csvc.dao.CoSoRepository;
import com.example.csvc.model.CoSo;
import com.example.csvc.service.CoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoSoServiceImpl implements CoSoService {
    @Autowired
    private CoSoRepository coSoRepository;
    @Override
    public List<CoSo> selectAllCoSo() {
        return coSoRepository.findAll();
    }
}
