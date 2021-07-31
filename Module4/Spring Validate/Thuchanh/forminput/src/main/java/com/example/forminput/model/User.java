package com.example.forminput.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity(name = "user")
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotBlank
    @Size(min = 2,max = 30)
    private String name;
    @Min(18)
    @Column(name = "age")

    private int age;

    @Column(name = "phonenumber")
    private String phoneNumber;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user=(User) target;
        String phone=user.phoneNumber;
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", null,"Ko duoc rong");
        if(phone.length()>11 || phone.length()<10){
            errors.rejectValue("phoneNumber",null,"Length from 10 to 11");
        }
        if(!phone.startsWith("0")){
            errors.rejectValue("phoneNumber",null,"Phonenumber start with 0");
        }
        if (!phone.matches("(^$|[0-9]*$)")){
            errors.rejectValue("phoneNumber", null,"Phone number contains number");
        }
    }
}
