package repository;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {
    List<Customer> selectAllCustomer();
    void save (Customer customer);
    void remove(int customerid);
    Customer findCustomerById(int customerId);
    void update(int customerId, Customer customer);
    String findNameCustomer(int customerId);
}
