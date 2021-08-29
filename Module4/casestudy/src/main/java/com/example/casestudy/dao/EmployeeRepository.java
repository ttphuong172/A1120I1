package com.example.casestudy.dao;

import com.example.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Page<Employee> findByEmployeeNameContaining(Pageable pageable, String nameemployee);

    Page<Employee> findByEmployeeNameContainingAndDivision_DivisionId(Pageable pageable, String nameemployee ,int iddivison);
}
