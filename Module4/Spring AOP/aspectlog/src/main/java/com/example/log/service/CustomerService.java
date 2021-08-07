package com.example.log.service;

import com.example.log.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> selectAllCustomer();
    void saveCustomerService(Customer customer) throws DuplicateEmailException;
    Customer selectCustomerById(int id);
}
