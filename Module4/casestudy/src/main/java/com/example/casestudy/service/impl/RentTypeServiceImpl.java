package com.example.casestudy.service.impl;

import com.example.casestudy.dao.RentTypeRepository;
import com.example.casestudy.model.RentType;
import com.example.casestudy.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    private RentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> selectAllRentType() {
        return rentTypeRepository.findAll();
    }
}
