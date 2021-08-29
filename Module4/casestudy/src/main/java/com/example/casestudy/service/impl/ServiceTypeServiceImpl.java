package com.example.casestudy.service.impl;

import com.example.casestudy.dao.ServiceTypeRepository;
import com.example.casestudy.model.ServiceType;
import com.example.casestudy.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;
    @Override
    public List<ServiceType> selectAllServiceType() {
        return serviceTypeRepository.findAll();
    }
}
