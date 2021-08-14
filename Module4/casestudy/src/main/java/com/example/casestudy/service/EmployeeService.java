package com.example.casestudy.service;

import com.example.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> selectAllEmployee(Pageable pageable);
    Employee findEmployeeById(int employeeId);
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Page<Employee> findByEmployeeNameContaining(Pageable pageable, String searchValue);
}
