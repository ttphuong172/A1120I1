package com.example.csvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("coso")
public class CoSoController {
    @GetMapping("")
    public String loadCoSo(Model model){
        return "coso/list";
    }
}
