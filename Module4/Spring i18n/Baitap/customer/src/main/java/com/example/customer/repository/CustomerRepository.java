package com.example.customer.repository;

import com.example.customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Page<Customer> findByNameContaining(String name,Pageable pageable);
}
