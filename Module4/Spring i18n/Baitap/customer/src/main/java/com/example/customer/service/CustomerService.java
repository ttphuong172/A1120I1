package com.example.customer.service;

import com.example.customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> selectAllCustomer(Pageable pageable);
    Page<Customer> findByNameContaining(String name, Pageable pageable);
    void saveCustomer(Customer customer);
    Customer findCustomerById(int id);
    void removeCustomer(Customer customer);

}
