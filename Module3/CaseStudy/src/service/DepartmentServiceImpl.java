package service;

import model.Department;
import repository.DepartmentRepository;
import repository.DepartmentRepositoryImpl;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentRepository departmentRepository=new DepartmentRepositoryImpl();
    @Override
    public List<Department> selectAllDepartment() {
        return departmentRepository.selectAllDepartnment();
    }

    @Override
    public Department findDepartmentById(String departmentId) {
        return departmentRepository.findDepartmentById(departmentId);
    }
}
