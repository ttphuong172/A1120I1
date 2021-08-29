package com.example.casestudy.service.impl;

import com.example.casestudy.dao.ServiceRepository;
import com.example.casestudy.model.Service;
import com.example.casestudy.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    @Override
    public List<Service> selectAllService() {
        return serviceRepository.findAll();
    }
}
