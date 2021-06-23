package repository;

import model.*;
import service.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    LevelService levelService = new LevelServiceImpl();
    DepartmentService departmentService = new DepartmentServiceImpl();
    DiplomaService diplomaService = new DiplomaServiceImpl();

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement("select employees.*,level.LevelName,department.DepartmentName,diploma.DiplomaName from employees \n" +
                    "inner join level\n" +
                    "on employees.LevelId=level.LevelId\n" +
                    "inner join department\n" +
                    "on employees.DepartmentId=department.DepartmentId\n" +
                    "inner join diploma\n" +
                    "on employees.DiplomaId=diploma.DiplomaId");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employeeid");
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");
                int cardId = resultSet.getInt("cardid");
                int phoneNumber = resultSet.getInt("phonenumber");
                String email = resultSet.getString("email");
                String levelId = resultSet.getString("levelid");
                String departmentId = resultSet.getString("departmentid");
                String diplomaId = resultSet.getString("diplomaid");

                String levelName = resultSet.getString("levelname");
                String departmentName = resultSet.getString("departmentname");
                String diplomaName = resultSet.getString("diplomaname");

                Level level = new Level(levelId, levelName);
                Department department = new Department(departmentId, departmentName);
                Diploma diploma = new Diploma(diplomaId, diplomaName);

                int salary = resultSet.getInt("salary");
                String address = resultSet.getString("address");
                Employee employee = new Employee(employeeId, name, birthday, cardId, phoneNumber, email, level, department, diploma, salary, address);
                employeeList.add(employee);
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
        return employeeList;
    }

    @Override
    public void save(Employee employee) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("insert into employees(name,birthday,cardid,phonenumber,email,levelid,departmentid,diplomaid,salary,address) values (?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.setInt(3, employee.getCardId());
            preparedStatement.setInt(4, employee.getPhoneNumber());
            preparedStatement.setString(5, employee.getEmail());
            preparedStatement.setString(6, employee.getLevel().getLevelId());
            preparedStatement.setString(7, employee.getDepartment().getDepartmentId());
            preparedStatement.setString(8, employee.getDiploma().getDiplomaId());
            preparedStatement.setInt(9, employee.getSalary());
            preparedStatement.setString(10, employee.getAddress());
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
    public Employee findEmployeeById(int employeeId) {
        Employee employee = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
//
            preparedStatement = connection.prepareStatement("select employees.*,level.LevelName,department.DepartmentName,diploma.DiplomaName from employees \n" +
                    "left join level\n" +
                    "on employees.LevelId=level.LevelId\n" +
                    "left join department\n" +
                    "on employees.DepartmentId=department.DepartmentId\n" +
                    "left join diploma\n" +
                    "on employees.DiplomaId=diploma.DiplomaId  where employeeId=?");
            preparedStatement.setInt(1, employeeId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String birthday = resultSet.getString("birthday");
                int cardId = resultSet.getInt("cardid");
                int phoneNumber = resultSet.getInt("phonenumber");
                String email = resultSet.getString("email");

                String levelId = resultSet.getString("levelid");
                String levelName = resultSet.getString("levelname");

                Level level = new Level(levelId,levelName);

                String departmentId = resultSet.getString("departmentid");
                String departmentName = resultSet.getString("departmentname");
                Department department=new Department(departmentId,departmentName);

                String diplomaId = resultSet.getString("diplomaid");
                String diplomaName = resultSet.getString("diplomaname");
                Diploma diploma = new Diploma(diplomaId,departmentName);
                int salary = resultSet.getInt("salary");
                String address = resultSet.getString("address");

                employee = new Employee(employeeId, name, birthday, cardId, phoneNumber, email, level, department, diploma, salary, address);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void update(int employeeId, Employee employee) {
        Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("update employees set name=?, birthday=?,cardid=?,phonenumber=?,email=?,levelid=?,departmentid=?,diplomaid=?, salary=?,address=? where employeeid=? ");
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.setInt(3, employee.getCardId());
            preparedStatement.setInt(4, employee.getPhoneNumber());
            preparedStatement.setString(5, employee.getEmail());
            preparedStatement.setString(6, employee.getLevel().getLevelId());
            preparedStatement.setString(7, employee.getDepartment().getDepartmentId());
            preparedStatement.setString(8, employee.getDiploma().getDiplomaId());
            preparedStatement.setInt(9, employee.getSalary());
            preparedStatement.setString(10, employee.getAddress());
            preparedStatement.setInt(11,employeeId);

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
    public void remove(int employeeId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement("delete from employees where employeeId=?");
            preparedStatement.setInt(1,employeeId);
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
    public String findNameEmployee(int employeeId) {
        Connection connection=DBConnection.getConnection();
        CallableStatement callableStatement=null;
        String employeeName=null;

        try {
            callableStatement=connection.prepareCall("call findNameEmployee(?,?)");
            callableStatement.setInt(1,employeeId);
            callableStatement.executeQuery();
            employeeName=callableStatement.getString(2);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                callableStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBConnection.close();
        }
        return  employeeName;
    }


}

