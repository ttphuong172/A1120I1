package repository;

import model.Department;

import java.util.List;

public interface DepartmentRepository {
    List<Department> selectAllDepartnment();
    Department findDepartmentById(String departmentId);
}
