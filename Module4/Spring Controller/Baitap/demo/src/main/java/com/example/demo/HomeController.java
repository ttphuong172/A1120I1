package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/hello")
    public String sayHello(Model model) {
        String[] names={"Phuong","Chau","Han"};
        model.addAttribute("nameList",names);
        return "index";
    }
}
