package com.example.casestudy.controller;

import com.example.casestudy.model.RentType;
import com.example.casestudy.service.RentTypeService;
import com.example.casestudy.service.ServiceService;
import com.example.casestudy.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("service")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private ServiceTypeService serviceTypeService;
    @Autowired
    private RentTypeService rentTypeService;

    @GetMapping("")
    public String listService(Model model){
        model.addAttribute("serviceList",serviceService.selectAllService());
        return "/service/list";
    }
}
