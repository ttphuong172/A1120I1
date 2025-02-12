package com.example.casestudy.service.impl;

import com.example.casestudy.dao.DivisionRepository;
import com.example.casestudy.dao.EmployeeRepository;
import com.example.casestudy.model.Division;
import com.example.casestudy.model.Employee;
import com.example.casestudy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


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
    public Page<Employee> findByEmployeeNameContainingAndDivision_DivisionId(Pageable pageable, String nameemployee, Optional<Integer> iddivison, Optional<Integer> idposition) {
        return employeeRepository.findByEmployeeNameContainingAndDivision_DivisionId(pageable,nameemployee,iddivison,idposition);
//        return employeeRepository.findByEmployeeNameContainingAndDivision_DivisionId(pageable,nameemployee,iddivison,idposition);
    }

    @Override
    public List<Employee> selectAllEmployee() {
        return employeeRepository.findAll();
    }

}
