package com.example.casestudy.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int employeeId;
    @NotBlank
    @Size(min = 3, max = 50)
    private String employeeName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate employeeBirthday;
    private String employeeIdCard;
    private double employeeSalary;
    private String employeePhone;
    @NotBlank
    @Email
    private String employeeEmail;
    private String employeeAddress;
    @ManyToOne
    @JoinColumn(name = "positionId",referencedColumnName = "positionId")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "educationDegreeId",referencedColumnName = "educationDegreeId")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "divisionId",referencedColumnName = "divisionId")
    private Division division;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, LocalDate employeeBirthday, String employeeIdCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, Position position) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(LocalDate employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }
}
