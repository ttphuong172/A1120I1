package com.example.demo.controller;

import com.example.demo.StudentRepository;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("create")
    public String createStudent(Student student, Model model) {
        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping("save")
    public String saveStudent(Student student) {
        System.out.println(student.getBirthday().getYear());
        System.out.println(student.getBirthday().getMonthValue());
        System.out.println(student.getBirthday().getDayOfMonth());
        studentRepository.save(student);
        return "redirect:/list";
    }

    @GetMapping("list")
    public String listStudent(Model model) {
        model.addAttribute("listStudent", studentRepository.findAll());
        return "list";
    }
}
