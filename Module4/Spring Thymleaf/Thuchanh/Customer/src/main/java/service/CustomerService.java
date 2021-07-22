package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> selectAllCustomer();
    void save(Customer customer);
    Customer findCustomerById(int id);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}
