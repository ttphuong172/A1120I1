package service;

import model.CustomerType;
import repository.CustomerTypeRepository;
import repository.CustomerTypeRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();
    @Override
    public CustomerType findCustomerTypeById(String customerTypeId) {
        return customerTypeRepository.findCustomerTypeById(customerTypeId);
    }

    @Override
    public List<CustomerType> selectAllCustomerType()  {
        return customerTypeRepository.selectAllCustomerType();
    }
}
