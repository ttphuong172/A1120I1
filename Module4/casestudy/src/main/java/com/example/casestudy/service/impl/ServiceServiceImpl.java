package com.example.casestudy.service.impl;

import com.example.casestudy.dao.ServiceRepository;
import com.example.casestudy.model.Service;
import com.example.casestudy.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    @Override
    public Page<Service> selectAllService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public void saveService(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void deleteService(Service service) {
        serviceRepository.delete(service);
    }

    @Override
    public Service findServiceById(int serviceId) {
        return serviceRepository.findById(serviceId).orElse(null);
    }

    @Override
    public Page<Service> findByServiceNameContainingAndRentType_RentTypeIdAndServiceType_ServiceTypeId(Pageable pageable,String nameservice, Optional<Integer> idrenttype, Optional<Integer> idservicetype) {
        return serviceRepository.findByServiceNameContainingAndRentType_RentTypeIdAndServiceType_ServiceTypeId(pageable,nameservice,idrenttype,idservicetype);
    }

    @Override
    public List<Service> selectAllService() {
        return serviceRepository.findAll();
    }
}
