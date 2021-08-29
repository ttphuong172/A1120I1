package com.example.casestudy.controller;

import com.example.casestudy.model.Customer;
import com.example.casestudy.service.CustomerService;
import com.example.casestudy.service.CustomerTypeService;
import com.example.casestudy.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerTypeService customerTypeService;
    @Autowired
    private GenderService genderService;
    @GetMapping("")
    public String listCustomer(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        model.addAttribute("customerList", customerService.selectAllCustomer(PageRequest.of(page, 4)));
        return "customer/list";
    }
    @GetMapping("create")
    public String createCustomer(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("genderList",genderService.selectAllGender());
        model.addAttribute("customerTypeList", customerTypeService.selectAllCustomerType());
        return "customer/create";
    }
    @PostMapping("save")
    public String saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer";
    }

    @GetMapping("detail/{customerId}")
    public String detailCustomer(@PathVariable int customerId,Model model){
        model.addAttribute("customer", customerService.findCustomerById(customerId));
     return "customer/detail";
    }

    @GetMapping("edit/{customerId}")
    public String editCustomer(@PathVariable int customerId,Model model){
        model.addAttribute("customer", customerService.findCustomerById(customerId));
        model.addAttribute("genderList",genderService.selectAllGender());
        model.addAttribute("customerTypeList", customerTypeService.selectAllCustomerType());
        return "customer/edit";
    }
    @PostMapping("update")
    public String updateCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer";
    }
    @GetMapping("delete/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){
        customerService.deleteCustomer(customerId);
        return "redirect:/customer";
    }


}
