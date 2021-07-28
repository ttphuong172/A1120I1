package com.skl.customer.model.service;

import com.skl.customer.model.entity.Customer;
import com.skl.customer.model.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements  CustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerRepository.getById(id);
    }

    @Override
    public void removeCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public List<Customer> findCustomerByName(String name) {
        return customerRepository.findByNameContaining(name);
    }
}
