package com.example.casestudy.dao;

import com.example.casestudy.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ContractRepository extends JpaRepository<Contract,Integer> {
    @Query("select c from Contract c where c.customer.customerName like %:customername% and (:startdate is null or c.contractStartDate=:startdate) and (:enddate is null or c.contractEndDate=:enddate)")
    List<Contract> findCustom(@Param("customername") String customername, @Param("startdate") LocalDate startdate, @Param("enddate") LocalDate enddate);
}
