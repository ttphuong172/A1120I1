package repository;

import model.CustomerType;

import java.sql.SQLException;
import java.util.List;

public interface CustomerTypeRepository {
    List<CustomerType> selectAllCustomerType() ;
    CustomerType findCustomerTypeById(String customerTypeId);

}
