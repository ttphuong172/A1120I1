package service;

import model.Customer;
import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> selectAllCustomer() {
         return customerRepository.selectAllCustomer();
    }

    @Override
    public void save(Customer customer)  {
        customerRepository.save(customer);
    }

    @Override
    public void remove(String customerid) {
        customerRepository.remove(customerid);
    }

    @Override
    public Customer findCustomerById(String customerId) {
       return customerRepository.findCustomerById(customerId);
    }

    @Override
    public void update(String customerId, Customer customer) {
        customerRepository.update(customerId,customer);
    }

    @Override
    public String findNameCustomer(String customerId) {
        return customerRepository.findNameCustomer(customerId);
    }

    @Override
    public int getLastCustomerId() {
        return customerRepository.getLastCustomerId();
    }
}
