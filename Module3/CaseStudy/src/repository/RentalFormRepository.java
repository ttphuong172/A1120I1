package repository;

import model.RentalForm;

import java.util.List;

public interface RentalFormRepository {
    List<RentalForm> selectAllRentalForm();
}
