package com.example.casestudy.service.impl;

import com.example.casestudy.dao.CustomerRepository;
import com.example.casestudy.model.Customer;
import com.example.casestudy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> selectAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(int customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public void deleteCustomer(int customerId) {
        Customer customer = customerRepository.findById(customerId).orElse(null);
        customerRepository.delete(customer);
    }
}
