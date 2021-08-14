package com.example.demo.service;


import com.example.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> selectAllCustomer(Pageable pageable);
    Page<Customer> findByNameContaining(String name, Pageable pageable);
    void saveCustomer(Customer customer);
    Customer findCustomerById(int id);
    void removeCustomer(Customer customer);

}
