package service;

import model.DetailContract;

import java.util.List;

public interface DetailContractService {
    List<DetailContract> selectAllDetailContract();
    DetailContract findDetailContractById(int detailContractId);
    void updateDetailContract(int contractId, DetailContract detailContract);
    void saveDetailContract(DetailContract detailContract);
    void removeDetailContract(int detailContractId);
}
