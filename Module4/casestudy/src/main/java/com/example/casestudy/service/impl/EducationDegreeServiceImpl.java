package com.example.casestudy.service.impl;

import com.example.casestudy.dao.EducationDegreeRepository;
import com.example.casestudy.model.EducationDegree;
import com.example.casestudy.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> selectAllEducationDegree() {
        return educationDegreeRepository.findAll();
    }
}
