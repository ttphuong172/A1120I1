package com.example.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping({"/home"})
    public String loadHomepage() {
        return "home";
    }

    @GetMapping("/denied")
    public String accessDenied() {
        return "denied";
    }


}
