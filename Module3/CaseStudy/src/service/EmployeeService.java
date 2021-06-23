package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> selectAllemployee();
    void save(Employee employee);
    Employee findEmployeeById(int employeeId);
    void update(int employeeId,Employee employee);
    void remove(int employeeId);
    String findNameEmployee (int employeeId);
}
