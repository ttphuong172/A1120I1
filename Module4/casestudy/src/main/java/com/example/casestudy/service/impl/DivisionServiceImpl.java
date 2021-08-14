package com.example.casestudy.service.impl;

import com.example.casestudy.dao.DivisionRepository;
import com.example.casestudy.model.Division;
import com.example.casestudy.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public List<Division> selectAllDivision() {
        return divisionRepository.findAll();
    }
}
