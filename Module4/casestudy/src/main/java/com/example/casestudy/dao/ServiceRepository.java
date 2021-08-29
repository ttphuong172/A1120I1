package com.example.casestudy.dao;

import com.example.casestudy.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Integer> {
}
