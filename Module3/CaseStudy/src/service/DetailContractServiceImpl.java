package service;

import model.DetailContract;
import repository.DetailContractRepository;
import repository.DetailContractRepositoryImpl;

import java.util.List;

public class DetailContractServiceImpl implements DetailContractService {
    DetailContractRepository detailContractRepository=new DetailContractRepositoryImpl();
    @Override
    public List<DetailContract> selectAllDetailContract() {
        return detailContractRepository.selectAllDetailContract();
    }

    @Override
    public DetailContract findDetailContractById(int detailContractId) {
        return detailContractRepository.findDetailContractById(detailContractId);
    }

    @Override
    public void updateDetailContract(int contractId, DetailContract detailContract) {
        detailContractRepository.updateDetailContract(contractId,detailContract);
    }

    @Override
    public void saveDetailContract(DetailContract detailContract) {
        detailContractRepository.saveDetailContract(detailContract);
    }

    @Override
    public void removeDetailContract(int detailContractId) {
        detailContractRepository.removeDetailContract(detailContractId);
    }
}
