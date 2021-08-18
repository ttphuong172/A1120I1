package com.example.casestudy.controller;

import com.example.casestudy.model.Employee;
import com.example.casestudy.service.DivisionService;
import com.example.casestudy.service.EducationDegreeService;
import com.example.casestudy.service.EmployeeService;
import com.example.casestudy.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller

@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private DivisionService divisionService;
    @Autowired
    private EducationDegreeService educationDegreeService;
    @GetMapping("")
    public String listEmployee(@RequestParam(value = "page",defaultValue = "0") int page, Model model){
        model.addAttribute("employeeList",employeeService.selectAllEmployee(PageRequest.of(page,4)));
        return "employee/list";
    }
    @GetMapping("edit/{employeeId}")
    public String editEmployee(@PathVariable int employeeId, Model model){
        model.addAttribute("employee",employeeService.findEmployeeById(employeeId));
        model.addAttribute("positionList",positionService.selectAllPosition());
        model.addAttribute("divisionList", divisionService.selectAllDivision());
        model.addAttribute("educationDegreeList", educationDegreeService.selectAllEducationDegree());
        return "employee/edit";
    }
    @PostMapping("update")
    public  String updateEmployee(Employee employee,RedirectAttributes redirectAttributes){
        employeeService.saveEmployee(employee);
        redirectAttributes.addFlashAttribute("msg","Cap nhat thanh cong");
        return "redirect:/employee";
    }

    @GetMapping("create")
    public  String createEmployee(Model model){
        model.addAttribute("employee", new Employee());
        model.addAttribute("positionList",positionService.selectAllPosition());
        model.addAttribute("divisionList", divisionService.selectAllDivision());
        model.addAttribute("educationDegreeList", educationDegreeService.selectAllEducationDegree());
        return "employee/create";
    }
    @PostMapping("save")
    public String saveEmployee(@Valid Employee employee,BindingResult bindingResult,RedirectAttributes redirectAttributes,Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("positionList",positionService.selectAllPosition());
            model.addAttribute("divisionList", divisionService.selectAllDivision());
            model.addAttribute("educationDegreeList", educationDegreeService.selectAllEducationDegree());
            return "employee/create";
        }
        employeeService.saveEmployee(employee);
        redirectAttributes.addFlashAttribute("msg","Them moi thanh cong");
        return "redirect:/employee";
    }

    @GetMapping("delete/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId,Model model){
        model.addAttribute("employee",employeeService.findEmployeeById(employeeId));
        model.addAttribute("positionList",positionService.selectAllPosition());
        model.addAttribute("divisionList", divisionService.selectAllDivision());
        model.addAttribute("educationDegreeList", educationDegreeService.selectAllEducationDegree());
        return "employee/remove";
    }
    @PostMapping("remove")
    public String removeEmployee(Employee employee, RedirectAttributes redirectAttributes){
        employeeService.deleteEmployee(employee);
        redirectAttributes.addFlashAttribute("msg","Da xoa thanh cong");
        return "redirect:/employee";
    }
    @GetMapping("search")
    public String searchEmployee(@RequestParam(value = "page",defaultValue ="0") int page,@RequestParam("searchValue") String searchValue,Model model){
        model.addAttribute("searchValue",searchValue);
        model.addAttribute("employeeListSearch",employeeService.findByEmployeeNameContaining(PageRequest.of(page,3),searchValue));
        return "employee/search";
    }
    @GetMapping("detail/{employeeId}")
    public String detailEmployee(@PathVariable int employeeId,Model model){
        model.addAttribute("employee",employeeService.findEmployeeById(employeeId));
        return "employee/detail";
    }
}
