package com.skl.customer.model.repository;

import com.skl.customer.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByNameContaining (String name);
}
