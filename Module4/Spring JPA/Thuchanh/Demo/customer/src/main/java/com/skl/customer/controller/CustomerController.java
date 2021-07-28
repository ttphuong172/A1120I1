package com.skl.customer.controller;


import com.skl.customer.model.entity.Customer;
import com.skl.customer.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("")
    public String getList(Model model) {

        model.addAttribute("customerList", customerService.findAll());
        return "list";
    }
    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable int id, Model model){
        model.addAttribute("customer",customerService.findCustomerById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String updateCustomer(Customer customer, RedirectAttributes redirectAttributes){

        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("msg","Cap nhat thanh cong");
        return "redirect:/customer";
    }
    @GetMapping("/create")
    public String createCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "create";
    }
    @PostMapping("/save")
    public String saveCustomer(Customer customer, RedirectAttributes redirectAttributes){

        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("msg","Them moi thanh cong");
        return "redirect:/customer";
    }
    @GetMapping("/search")
    public String searchCustomer (@RequestParam("search") String search,Model model){

        model.addAttribute("customerSearhList",customerService.findCustomerByName(search));
        return "result";
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id,Model model){

        model.addAttribute("customer",customerService.findCustomerById(id));
        return "delete";
    }

    @PostMapping("/remove")
    public String removeCustomer(Customer customer){
        customerService.removeCustomer(customer);
        return "redirect:/customer";
    }


}
