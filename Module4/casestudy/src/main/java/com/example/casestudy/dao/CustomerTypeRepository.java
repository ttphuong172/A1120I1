package com.example.casestudy.dao;

import com.example.casestudy.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
