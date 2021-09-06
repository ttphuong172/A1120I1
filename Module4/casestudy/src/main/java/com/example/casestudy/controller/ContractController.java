package com.example.casestudy.controller;

import com.example.casestudy.model.Contract;
import com.example.casestudy.service.ContractService;
import com.example.casestudy.service.CustomerService;
import com.example.casestudy.service.EmployeeService;
import com.example.casestudy.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Controller
@RequestMapping("contract")
public class ContractController {
    @Autowired
    private ContractService contractService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private CustomerService customerService;
    @GetMapping("")
    public String listContract(@RequestParam (defaultValue = "0") int page, Model model){
        model.addAttribute("contractList",contractService.selectAllContract(PageRequest.of(page,2)));
        return "contract/list";
    }
    @GetMapping("create")
    public String createContract(Model model){
        model.addAttribute("employeeList",employeeService.selectAllEmployee());
        model.addAttribute("serviceList",serviceService.selectAllService());
        model.addAttribute("customerList",customerService.selectAllCustomer());
        model.addAttribute("contract",new Contract());
        return "contract/create";
    }
    @PostMapping("save")
    public String saveCustomer(@Valid Contract contract, BindingResult bindingResult,Model model){
        new Contract().validate(contract,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("employeeList",employeeService.selectAllEmployee());
            model.addAttribute("serviceList",serviceService.selectAllService());
            model.addAttribute("customerList",customerService.selectAllCustomer());
            return "contract/create";
        }
        long days= ChronoUnit.DAYS.between(contract.getContractStartDate(),contract.getContractEndDate());
        double price= contract.getService().getServiceCost();
        double total=days*price;
        contract.setContractTotalMoney(total);
        if(contract.getEmployee() == null && (contract.getService()==null) && (contract.getCustomer()==null)){
            return "contract/create";
        }
        contractService.saveCustomer(contract);
        return "redirect:/contract";
    }
    @GetMapping("edit/{contractId}")
    public String editContract(@PathVariable int contractId, Model model){
        model.addAttribute("employeeList",employeeService.selectAllEmployee());
        model.addAttribute("serviceList",serviceService.selectAllService());
        model.addAttribute("customerList",customerService.selectAllCustomer());
        model.addAttribute("contract",contractService.findContractById(contractId));
        return "contract/edit";
    }
    @PostMapping("update")
    public String updateContract(@Valid Contract contract, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        new Contract().validate(contract,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("employeeList",employeeService.selectAllEmployee());
            model.addAttribute("serviceList",serviceService.selectAllService());
            model.addAttribute("customerList",customerService.selectAllCustomer());
            return "contract/edit";
        }
        long days= ChronoUnit.DAYS.between(contract.getContractStartDate(),contract.getContractEndDate());
        double price= contract.getService().getServiceCost();
        double total=days*price;
        contract.setContractTotalMoney(total);
        contractService.saveCustomer(contract);
        redirectAttributes.addFlashAttribute("msg","Cap nhat thanh cong");
        return "redirect:/contract";
    }
    @GetMapping("detail/{contractId}")
    public String detailContract(Model model){
        return "contract/detail";
    }
    @GetMapping("delete/{contractId}")
    public String deleteContract(@PathVariable int contractId){
        Contract contract=contractService.findContractById(contractId);
        contractService.deleteContract(contract);
        return "redirect:/contract";
    }
    @GetMapping("search")
    public String searchContract(@RequestParam String customername, @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") Optional<LocalDate>  startdate, @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") Optional<LocalDate> enddate , Model model){
        model.addAttribute("customername",customername);
        model.addAttribute("startdate",startdate.orElse(null));
        model.addAttribute("enddate",enddate.orElse(null));
        model.addAttribute("contractSearchList",contractService.findCustom(customername,startdate.orElse(null),enddate.orElse(null)));
        return "contract/list";
    }
}
