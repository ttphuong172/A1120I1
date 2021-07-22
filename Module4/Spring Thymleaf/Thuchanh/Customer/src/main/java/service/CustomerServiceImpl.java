package service;

import model.Customer;
import repository.CustomRepositoryImpl;
import repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    CustomerRepository customerRepository=new CustomRepositoryImpl();
    @Override
    public List<Customer> selectAllCustomer() {
        return customerRepository.selectAllCustomer();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerRepository.findCustomerById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteCustomer(id);
    }
}
