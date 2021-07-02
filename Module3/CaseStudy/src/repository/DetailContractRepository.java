package repository;

import model.DetailContract;

import java.util.List;

public interface DetailContractRepository {
    List<DetailContract> selectAllDetailContract();
    DetailContract findDetailContractById(int detailContractId);
    void updateDetailContract(int detailContractId, DetailContract detailContract);
    void saveDetailContract(DetailContract detailContract);
    void removeDetailContract(int detailContractId);
}
