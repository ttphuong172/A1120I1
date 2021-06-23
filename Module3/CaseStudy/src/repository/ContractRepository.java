package repository;

import model.Contract;

import java.util.List;

public interface ContractRepository {
    List<Contract> selectAllContract();
    void save(Contract contract);
    Contract findContractById(int contractId);
}
