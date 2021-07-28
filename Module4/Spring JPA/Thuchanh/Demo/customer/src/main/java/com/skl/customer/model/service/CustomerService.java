package com.skl.customer.model.service;

import com.skl.customer.model.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void saveCustomer(Customer customer);
    Customer findCustomerById(int id);
    void removeCustomer(Customer customer);
    List<Customer> findCustomerByName(String name);
}
