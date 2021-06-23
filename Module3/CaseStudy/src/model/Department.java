package model;

public class Department {
    private String departmentId;
    private String DepartmentName;

    public Department(String departmentId, String DepartmentName) {
        this.departmentId = departmentId;
        this.DepartmentName = DepartmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.DepartmentName = departmentName;
    }
}
