package com.example.demo.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/index")
    public String loadIndex(){
        return "index";
    }
}
