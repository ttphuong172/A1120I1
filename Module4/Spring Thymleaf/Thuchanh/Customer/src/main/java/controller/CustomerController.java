package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.CustomerService;
import service.CustomerServiceImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("")
    public String index(Model model){
        CustomerService customerService=new CustomerServiceImpl();
        model.addAttribute("customerList",customerService.selectAllCustomer());
        return "index";
    }
    @GetMapping("/create")
    public  String create(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @PostMapping("/save")
    public String saveCustomer(Customer customer, RedirectAttributes redirectAttributes){
        CustomerService customerService=new CustomerServiceImpl();
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success", "Them moi thanh cong");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        CustomerService customerService=new CustomerServiceImpl();
        model.addAttribute("customer", customerService.findCustomerById(id));
        System.out.println("ABC");
        return "edit";
    }
    @PostMapping("/update")
    public String update(Customer customer) {
        CustomerService customerService=new CustomerServiceImpl();
        customerService.updateCustomer(customer);
        return "redirect:/customer";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        CustomerService customerService=new CustomerServiceImpl();
        model.addAttribute("customer", customerService.findCustomerById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        CustomerService customerService=new CustomerServiceImpl();
        customerService.deleteCustomer(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        CustomerService customerService=new CustomerServiceImpl();
        model.addAttribute("customer", customerService.findCustomerById(id));
        return "/view";
    }
}
