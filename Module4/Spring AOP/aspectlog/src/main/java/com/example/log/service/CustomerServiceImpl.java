package com.example.log.service;

import com.example.log.dao.CustomerRepository;
import com.example.log.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService  {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> selectAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomerService(Customer customer) throws DuplicateEmailException {
        try {
            customerRepository.save(customer);
        }
        catch (DataIntegrityViolationException e)
        {
           throw new DuplicateEmailException();
        }

    }

    @Override
    public Customer selectCustomerById(int id) {
        return customerRepository.getById(id);
    }
}
