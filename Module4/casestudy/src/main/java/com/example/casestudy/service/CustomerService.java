package com.example.casestudy.service;

import com.example.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> selectAllCustomer(Pageable pageable);
    void saveCustomer(Customer customer);
    Customer findCustomerById(int customerId);
    void deleteCustomer(int customerId);
}
