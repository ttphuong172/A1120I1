package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DemoController {
    @GetMapping("")
    public String hello(@CookieValue(value = "foo",defaultValue = "hello") String fooCookie, Model model, HttpServletResponse response){
        Cookie foo=new Cookie("foo","abcd");
        foo.setMaxAge(5);
        response.addCookie(foo);
        model.addAttribute("fooCookie",fooCookie);
        return "hello";
    }
}
