package com.example.phone.controller;
import com.example.phone.model.Phone;
import com.example.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("phone")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;
    @GetMapping("list")
    public ResponseEntity<List<Phone>> loadPhone(){
        List<Phone> phoneList=phoneService.selectAllPhone();
       return new ResponseEntity<>(phoneList,HttpStatus.OK);
    }

    @GetMapping("create")
    public ModelAndView createPhone(){
        ModelAndView modelAndView=new ModelAndView();
        LocalDateTime localDateTime = LocalDateTime.now();
        modelAndView.addObject("time",localDateTime);
        modelAndView.setViewName("create.html");
        return modelAndView;
    }

    @PostMapping("save")
    public ResponseEntity<?> savePhone(@Valid @RequestBody Phone phone, BindingResult bindingResult){
        if(bindingResult.hasErrors()){

        }
        phoneService.savePhone(phone);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?>deletePhone(@PathVariable int id){
        phoneService.deletePhone(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("edit/{id}")
    public ResponseEntity<Phone> editPhone(@PathVariable int id){
        Phone phone=phoneService.findPhoneById(id);
        return new ResponseEntity<>(phone,HttpStatus.OK);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable int id, @RequestBody Phone phone){
        Phone currentPhone=phoneService.findPhoneById(id);
        if(currentPhone==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentPhone.setModel(phone.getModel());
        currentPhone.setPrice(phone.getPrice());
        currentPhone.setProducer(phone.getProducer());
        phoneService.savePhone(currentPhone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
