package service;

import model.RentalForm;

import java.util.List;

public interface RentalFormService {
    List<RentalForm> selectAllRentalForm();
    RentalForm findRentalFormById(String rentalFormId);
}
