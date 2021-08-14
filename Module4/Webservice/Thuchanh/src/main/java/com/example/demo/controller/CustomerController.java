package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ResponseEntity<Page<Customer>> listCustomer(@RequestParam(value = "page", defaultValue = "0") int page) {
        Page<Customer> customerPage = customerService.selectAllCustomer(PageRequest.of(page, 2));
        return new ResponseEntity<>(customerPage, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int id){
        Customer customer=customerService.findCustomerById(id);
        if(customer==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }
    @PostMapping("save")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return new ResponseEntity<>("Them moi thanh cong",HttpStatus.OK);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable int id, @RequestBody Customer customer){
        Customer currentCustomer=customerService.findCustomerById(id);
        if(currentCustomer==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentCustomer.setName(customer.getName());
        currentCustomer.setEmail(currentCustomer.getEmail());
        customerService.saveCustomer(customer);
        return new ResponseEntity<>(currentCustomer,HttpStatus.OK);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable int id){
        Customer customer=customerService.findCustomerById(id);
        if(customer==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.removeCustomer(customer);
        return new ResponseEntity<>("Xoa thanh cong",HttpStatus.OK);
    }
}
