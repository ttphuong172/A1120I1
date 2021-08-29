package com.example.casestudy.service.impl;

import com.example.casestudy.dao.GenderRepository;
import com.example.casestudy.model.Gender;
import com.example.casestudy.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {
    @Autowired
    private GenderRepository genderRepository;

    @Override
    public List<Gender> selectAllGender() {
        return genderRepository.findAll();
    }
}
