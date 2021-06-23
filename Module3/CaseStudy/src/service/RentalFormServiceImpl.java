package service;

import model.RentalForm;
import repository.RentalFormRepository;
import repository.RentalFormRepositoryImpl;
import service.RentalFormService;

import java.util.List;

public class RentalFormServiceImpl implements RentalFormService {
    RentalFormRepository rentalFormRepository = new RentalFormRepositoryImpl();
    @Override
    public List<RentalForm> selectAllRentalForm() {
        return rentalFormRepository.selectAllRentalForm();
    }

    @Override
    public RentalForm findRentalFormById(String rentalFormId) {
        return rentalFormRepository.findRentalFormById(rentalFormId);
    }
}
