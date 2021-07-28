package com.codegym.demo_a11.model.service.impl;

import com.codegym.demo_a11.model.entity.Student;
import com.codegym.demo_a11.model.repository.IStudentRepository;
import com.codegym.demo_a11.model.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public void save(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }
}
