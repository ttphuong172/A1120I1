package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import repository.EmployeeRepository;
import repository.EmployeeRepositoryImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping(value = {"","/list"})
    public String getListEmployee(Model model){
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        model.addAttribute("employeeList",employeeRepository.selectAllEmployee());
        return "list";
    }
    @GetMapping("/edit/{id}")
    public String getEdit(@PathVariable int id,Model model){
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        model.addAttribute("employee", employeeRepository.findEmployeeById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        employeeRepository.updateEmployee(employee);
        return "redirect:list";
    }

}
