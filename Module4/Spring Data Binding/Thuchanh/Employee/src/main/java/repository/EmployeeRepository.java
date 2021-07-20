package repository;

import model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> selectAllEmployee();
    Employee findEmployeeById(int id);
    void updateEmployee(Employee employee);
}
