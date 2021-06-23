package service;

import model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> selectAllDepartment();
    Department findDepartmentById(String departmentId);
}
