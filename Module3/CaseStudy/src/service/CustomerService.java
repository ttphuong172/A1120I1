package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    List<Customer> selectAllCustomer() ;
    String save (Customer customer);
    void remove(String customerid);
    Customer findCustomerById(String customerId);
    void update(String customerId, Customer customer);
    String findNameCustomer(String customerId);
    int getLastCustomerId ();
}
