package com.example.casestudy.service;

import com.example.casestudy.dao.CustomerTypeRepository;
import com.example.casestudy.model.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> selectAllCustomerType();
}
