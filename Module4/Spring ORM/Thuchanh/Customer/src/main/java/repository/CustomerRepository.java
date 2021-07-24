package repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> selectAllCustomer();
    Customer findCustomerById(int id);
    List<Customer> findCustomerByName(String name);
    void updateCustomer(Customer customer);
    void saveCustomer(Customer customer);
    void removeCustomer(Customer customer);
}
