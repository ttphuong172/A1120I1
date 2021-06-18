package repository;

import model.RentalForm;

import java.util.List;

public class RentalFormServiceImpl implements RentalFormService {
    RentalFormRepository rentalFormRepository = new RentalFormRepositoryImpl();
    @Override
    public List<RentalForm> selectAllRentalForm() {
        return rentalFormRepository.selectAllRentalForm();
    }
}
