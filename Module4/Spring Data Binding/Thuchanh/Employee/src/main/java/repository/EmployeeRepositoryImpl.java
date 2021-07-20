package repository;

import model.DBConnection;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public List<Employee> selectAllEmployee() {
        Connection connection= DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Employee> employeeList=new ArrayList<>();

        try {
            preparedStatement=connection.prepareStatement("select * from employee");
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String contactNumber=resultSet.getString("contactnumber");
                Employee employee=new Employee(id,name,contactNumber);
                employeeList.add(employee);
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
        return employeeList;
    }

    @Override
    public Employee findEmployeeById(int id) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Employee employee=null;

        try {
            preparedStatement=connection.prepareStatement("select * from employee where id=?");
            preparedStatement.setInt(1,id);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String contactNumber=resultSet.getString("contactnumber");
                 employee=new Employee(id,name,contactNumber);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public void updateEmployee(Employee employee) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement=connection.prepareStatement("update employee set name=?, contactnumber=? where id=?");
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getContactNumber());
            preparedStatement.setInt(3, employee.getId());
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
}
