package com.example.hoianoldtown;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
public class HomeController {
    @GetMapping("")
    public String loadIndex(){
        return "index";
    }
}
