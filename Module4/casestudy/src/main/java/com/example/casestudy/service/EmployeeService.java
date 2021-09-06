package com.example.casestudy.service;

import com.example.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Page<Employee> selectAllEmployee(Pageable pageable);
    Employee findEmployeeById(int employeeId);
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    Page<Employee> findByEmployeeNameContainingAndDivision_DivisionId(Pageable pageable, String nameemployee, Optional<Integer> iddivison,Optional<Integer> idposition);
    List<Employee> selectAllEmployee();
}
