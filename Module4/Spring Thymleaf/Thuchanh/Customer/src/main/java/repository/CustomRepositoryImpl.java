package repository;

import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomRepositoryImpl implements CustomerRepository{
    @Override
    public List<Customer> selectAllCustomer() {
        Connection connection =DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Customer> customerList=new ArrayList<>();

        try {
            preparedStatement=connection.prepareStatement("select * from customer");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                String email=resultSet.getString("email");
                String address=resultSet.getString("address");
                Customer customer=new Customer(id,name,email,address);
                customerList.add(customer);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            DBConnection.close();
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("insert into customer(name,email,address) values (?,?,?)");
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getEmail());
            preparedStatement.setString(3 ,customer.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            DBConnection.close();
        }
    }

    @Override
    public Customer findCustomerById(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null;
        Customer customer = null;
        try {
            preparedStatement=connection.prepareStatement("select * from customer where id=?");
            preparedStatement.setInt(1,id);

            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email=resultSet.getString("email");
                String address=resultSet.getString("address");
                customer=new Customer(id,name,email,address);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public void updateCustomer(Customer customer) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement=connection.prepareStatement("update customer set name=?, email=?, address=? where id=?");
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getEmail());
            preparedStatement.setString(3,customer.getAddress());
            preparedStatement.setInt(4, customer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteCustomer(int id) {
        Connection connection =DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("delete from customer where id=?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
