package com.example.jwthelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
