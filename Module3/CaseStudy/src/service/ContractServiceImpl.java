package service;

import model.Contract;
import repository.ContractRepository;
import repository.ContractRepositoryImpl;

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
}
