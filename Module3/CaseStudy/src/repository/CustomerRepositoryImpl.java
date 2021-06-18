package repository;

import model.Customer;
import model.CustomerType;
import service.CustomerTypeService;
import service.CustomerTypeServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    CustomerTypeService customerTypeService = new CustomerTypeServiceImpl();

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try (Connection connection = DBConnection.getConnection()) {
            preparedStatement = connection.prepareStatement("select * from customers");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customerid");
                String customerName = resultSet.getString("customername");
                String birthday = resultSet.getString("birthday");
                int idCard = resultSet.getInt("idcard");
                int phoneNumber = resultSet.getInt("phonenumber");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String customerTypeId = resultSet.getString("customertypeid");
                // CustomerType customerType = customerTypeService.findCustomerTypeById(customerTypeId);
                Customer customer = new Customer(customerId, customerName, birthday, idCard, phoneNumber, email, customerTypeId, address);
                customerList.add(customer);

            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.getMessage();
            }
            DBConnection.close();
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        PreparedStatement preparedStatement = null;
        try (Connection connection = DBConnection.getConnection()) {
            preparedStatement = connection.prepareStatement("insert into customers(customername,birthday,idcard,phonenumber,email,customertypeid,address) values (?,?,?,?,?,?,?)");
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getBirthday());
            preparedStatement.setInt(3, customer.getIdCard());
            preparedStatement.setInt(4, customer.getPhoneNumber());
            preparedStatement.setString(5, customer.getEmail());
            preparedStatement.setString(6, customer.getCustomertypeid());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.getMessage();
                }
                DBConnection.close();
            }


        }
    }

    @Override
    public void remove(int customerid) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("delete from customers where customerid=?");
            preparedStatement.setInt(1, customerid);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }


    }

    @Override
    public Customer findCustomerById(int customerId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Customer customer = null;

        try {
            preparedStatement = connection.prepareStatement("select * from customers where customerid=?");
            preparedStatement.setInt(1, customerId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String customerName = resultSet.getString("customername");
                String birthday = resultSet.getString("birthday");
                int idCard = resultSet.getInt("idcard");
                int phoneNumber = resultSet.getInt("phonenumber");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String customerTypeId = resultSet.getString("customertypeid");
                System.out.println(customerTypeId);
                //CustomerType customerType = customerTypeService.findCustomerTypeById(customerTypeId);
                customer = new Customer(customerId, customerName, birthday, idCard, phoneNumber, email, customerTypeId, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }   finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e){
                e.getMessage();
            }
            DBConnection.close();
        }

        return customer;
    }

    @Override
    public void update(int customerId, Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("update customers set customername=?, birthday=?,idcard=?, phonenumber=?,email=?,customertypeid=?,address=? where customerid=? ");
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getBirthday());
            preparedStatement.setInt(3, customer.getIdCard());
            preparedStatement.setInt(4, customer.getPhoneNumber());
            preparedStatement.setString(5, customer.getEmail());
            preparedStatement.setString(6, customer.getCustomertypeid());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customerId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                preparedStatement.close();
            } catch (SQLException e){
                e.getMessage();
            }
            DBConnection.close();
        }
    }
}
