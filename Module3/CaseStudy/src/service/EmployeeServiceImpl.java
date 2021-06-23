package service;

import model.Employee;
import model.Level;
import repository.DBConnection;
import repository.EmployeeRepository;
import repository.EmployeeRepositoryImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository=new EmployeeRepositoryImpl();

    @Override
    public List<Employee> selectAllemployee() {
        return employeeRepository.selectAllEmployee();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee findEmployeeById(int employeeId) {
        return employeeRepository.findEmployeeById(employeeId);
    }

    @Override
    public void update(int employeeId, Employee employee) {
        employeeRepository.update(employeeId,employee);
    }

    @Override
    public void remove(int employeeId) {
        employeeRepository.remove(employeeId);
    }

    @Override
    public String findNameEmployee(int employeeId) {
        return employeeRepository.findNameEmployee(employeeId);
    }


}
