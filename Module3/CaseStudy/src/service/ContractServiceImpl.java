package service;

import model.Contract;
import repository.ContractRepository;
import repository.ContractRepositoryImpl;
import repository.DBConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ContractServiceImpl implements ContractService {
    ContractRepository contractRepository=new ContractRepositoryImpl();
    @Override
    public List<Contract> selectAllContract() {
        return contractRepository.selectAllContract();
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public Contract findContractById(int contractId) {
        return contractRepository.findContractById(contractId);
    }

    @Override
    public void update(int contractid, Contract contract) {
        contractRepository.update(contractid, contract);
    }

    @Override
    public void delete(int contractId) {
        contractRepository.delete(contractId);
    }

    @Override
    public List<Contract> findContract(String valueFind) {
        return contractRepository.findContract(valueFind);
    }


}
