package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.AddressService;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Service
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AddressService addressService;
    @GetMapping("")
    public String listCustomer(@RequestParam(value = "page",defaultValue = "0") int page, Model model){
        model.addAttribute("customerList",customerService.selectAllCustomer(PageRequest.of(page,3)));
        return "list";
    }
    @GetMapping("/search")
    public String searchCustomer(@RequestParam(value = "page",defaultValue = "0") int page,@RequestParam("name") String name,Model model){
        model.addAttribute("name",name);
       model.addAttribute("customerSearch",customerService.findByNameContaining(name,PageRequest.of(page,2)));
        return "search";
    }
    @GetMapping("/create")
    public String createCustomer(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("addressList",addressService.selectAllAddress());
        return "create";
    }
    @PostMapping("/save")
    public String saveCustomer(Customer customer, RedirectAttributes redirectAttributes){
        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("msg","Them moi thanh cong");
        return "redirect:/customer";
    }
    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable int id, Model model){
        model.addAttribute("customer",customerService.findCustomerById(id));
        model.addAttribute("addressList",addressService.selectAllAddress());
        return "edit";
    }
    @PostMapping("/update")
    public String updateCustomer(Customer customer,RedirectAttributes redirectAttributes){
        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("msg","Cap nhat thanh cong");
        return "redirect:/customer";
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findCustomerById(id));
        model.addAttribute("addressList",addressService.selectAllAddress());
        return "delete";
    }
    @PostMapping("remove")
    public String removeCustomer(Customer customer){
        customerService.removeCustomer(customer);
        return "redirect:/customer";
    }

}
