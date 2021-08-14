package com.example.casestudy.service.impl;

import com.example.casestudy.dao.EmployeeRepository;
import com.example.casestudy.model.Employee;
import com.example.casestudy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> selectAllEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee findEmployeeById(int employeeId) {
        return employeeRepository.getById(employeeId);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Page<Employee> findByEmployeeNameContaining(Pageable pageable, String searchValue) {
        return employeeRepository.findByEmployeeNameContaining(pageable,searchValue);
    }
}
