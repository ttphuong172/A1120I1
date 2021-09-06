package com.example.casestudy.service;

import com.example.casestudy.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ServiceService {
    Page<Service> selectAllService(Pageable pageable);
    void saveService(Service service);
    void deleteService(Service service);
    Service findServiceById (int serviceId);
    Page<Service> findByServiceNameContainingAndRentType_RentTypeIdAndServiceType_ServiceTypeId(Pageable pageable,String nameservice, Optional<Integer> idrenttype, Optional<Integer> idservicetype);
    List<Service> selectAllService();
}
