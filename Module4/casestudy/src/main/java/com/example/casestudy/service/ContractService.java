package com.example.casestudy.service;

import com.example.casestudy.model.Contract;
import com.example.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ContractService {
    Page<Contract> selectAllContract(Pageable pageable);
    void saveCustomer(Contract contract);
    Contract findContractById(int contractId);
    void deleteContract(Contract contract);
    List<Contract> findCustom(@Param("customername") String customername, @Param("startdate") LocalDate startdate, @Param("enddate") LocalDate enddate);
}
