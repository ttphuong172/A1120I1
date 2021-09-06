package com.example.casestudy.dao;

import com.example.casestudy.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ServiceRepository extends JpaRepository<Service,Integer> {
    @Query("select s from Service s WHERE (s.serviceName like %:service_name%) and (:rent_type_id is null or s.rentType.rentTypeId=:rent_type_id) and (:service_type_id is null or s.serviceType.serviceTypeId=:service_type_id) ")
    Page<Service> findByServiceNameContainingAndRentType_RentTypeIdAndServiceType_ServiceTypeId(Pageable pageable, @Param("service_name") String service_name, @Param("rent_type_id") Optional<Integer> rent_type_id, @Param("service_type_id") Optional<Integer> service_type_id);

}
