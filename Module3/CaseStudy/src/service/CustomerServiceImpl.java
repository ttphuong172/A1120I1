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
    public void remove(int customerid) {
        customerRepository.remove(customerid);
    }

    @Override
    public Customer findCustomerById(int customerId) {
       return customerRepository.findCustomerById(customerId);
    }

    @Override
    public void update(int customerId, Customer customer) {
        customerRepository.update(customerId,customer);
    }

    @Override
    public String findNameCustomer(int customerId) {
        return customerRepository.findNameCustomer(customerId);
    }
}
