package com.example.customer.service;

import com.example.customer.model.Address;
import com.example.customer.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> selectAllAddress() {
        return addressRepository.findAll();
    }
}
