package com.example.demo1.controller;

import com.example.demo1.model.TaiKhoan;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private UserService userService;
    @Autowired
    protected BCryptPasswordEncoder bCryptPasswordEncoder;


    @GetMapping({"", "/homepage"})
    public String loadHomepage() {
        return "homepage";
    }

    @GetMapping("/login")
    public String loadLogin() {
        return "login";
    }


    @GetMapping("test")
    public String test() {
        return "abc";
    }

    @GetMapping("access")
    public String deny() {
        return "access";
    }

    @GetMapping("createUser")
    public String createUser(Model model) {
        model.addAttribute("taiKhoan", new TaiKhoan());
        System.out.println();
        return "create";
    }

    @PostMapping("saveUser")
    public String saveUser(TaiKhoan taiKhoan) {
        taiKhoan.setPassword(bCryptPasswordEncoder.encode(taiKhoan.getPassword()));
        userService.saveUser(taiKhoan);
        return "success";
    }
}
