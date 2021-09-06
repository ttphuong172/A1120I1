package com.example.casestudy.dao;

import com.example.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findByEmployeeNameContaining(Pageable pageable, String nameemployee);


    @Query("SELECT e FROM Employee e INNER JOIN e.division d JOIN e.position p WHERE (e.employeeName like %:employee_name%) and (:division_id is null or d.divisionId=:division_id) and (:position_id is null or p.positionId=:position_id)")
    Page<Employee> findByEmployeeNameContainingAndDivision_DivisionId(Pageable pageable, @Param("employee_name") String employee_name, @Param("division_id") Optional<Integer> division_id,Optional<Integer> position_id);
}
