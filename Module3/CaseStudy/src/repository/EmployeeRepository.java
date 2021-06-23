package repository;

import model.Contract;
import model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> selectAllEmployee();
    void save(Employee employee);
    Employee findEmployeeById (int employeeId);
    void update(int employeeId,Employee employee);
    void remove (int employeeId);
    String findNameEmployee (int employeeId);

}
