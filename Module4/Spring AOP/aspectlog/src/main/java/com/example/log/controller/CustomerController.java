package com.example.log.controller;

import com.example.log.model.Customer;
import com.example.log.service.CustomerService;
import com.example.log.service.DuplicateEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;

@Controller
@Service
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("")
    public String loadList(Model model){
        model.addAttribute("customerList",customerService.selectAllCustomer());
        return "list";
    }
    @GetMapping("create")
    public String createCustomer(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @PostMapping("save")
    public  String saveCustomer(Customer customer) throws DuplicateEmailException {


            customerService.saveCustomerService(customer);

        return "redirect:/customer";
    }
    @GetMapping("muonsach/{id}")
    public String muonSach(@PathVariable int id, Model model){
        model.addAttribute("customer",customerService.selectCustomerById(id));
        return "muonsach";
    }


    @ExceptionHandler(DuplicateEmailException.class)
    public String errorName(){
        return "sorry";
    }
}
