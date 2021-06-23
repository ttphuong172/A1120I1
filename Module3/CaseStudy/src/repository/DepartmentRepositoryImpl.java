package repository;

import model.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepositoryImpl implements DepartmentRepository {
    @Override
    public List<Department> selectAllDepartnment() {
        List<Department> departmentList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement("select * from department");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String departmentId = resultSet.getString("departmentId");
                String departmentName = resultSet.getString("departmentName");
                Department department = new Department(departmentId, departmentName);
                departmentList.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();

        }
        return departmentList;
    }

    @Override
    public Department findDepartmentById(String departmentId) {
        Department department = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement("select * from Department where departmentId=?");
            preparedStatement.setString(1, departmentId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String departmentName = resultSet.getString("departmentname");
                department = new Department(departmentId, departmentName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return department;
    }
}
