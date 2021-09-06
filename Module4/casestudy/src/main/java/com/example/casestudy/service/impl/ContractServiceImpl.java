package com.example.casestudy.service.impl;

import com.example.casestudy.dao.ContractRepository;
import com.example.casestudy.model.Contract;
import com.example.casestudy.model.Customer;
import com.example.casestudy.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Override
    public Page<Contract> selectAllContract(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void saveCustomer(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public Contract findContractById(int contractId) {
        return contractRepository.findById(contractId).orElse(null);
    }

    @Override
    public void deleteContract(Contract contract) {
     contractRepository.delete(contract);
    }

    @Override
    public List<Contract> findCustom(String customername, LocalDate startdate, LocalDate enddate) {
        return contractRepository.findCustom(customername,startdate,enddate);
    }


}
