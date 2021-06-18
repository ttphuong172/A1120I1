package service;

import model.CustomerType;

import java.sql.SQLException;
import java.util.List;

public interface CustomerTypeService {
    CustomerType findCustomerTypeById(String customerTypeId);
    List<CustomerType> selectAllCustomerType();
}
