package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("")
    public String getList(Model model) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        model.addAttribute("customerList", customerRepository.selectAllCustomer());
        return "list";
    }
    @GetMapping("/edit/{id}")
    public String editSanPham(@PathVariable int id, Model model){
        CustomerRepository customerRepository=new CustomerRepositoryImpl();
        model.addAttribute("sanPham",customerRepository.findCustomerById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String updateSanPham(Customer customer, RedirectAttributes redirectAttributes){
        CustomerRepository customerRepository=new CustomerRepositoryImpl();
        customerRepository.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("msg","Cap nhat thanh cong");
        return "redirect:/customer";
    }
    @GetMapping("/create")
    public String createSanPham(Model model){
        model.addAttribute("customer", new Customer());
        return "create";
    }
    @PostMapping("/save")
    public String saveSanPham(Customer customer, RedirectAttributes redirectAttributes){
        CustomerRepository customerRepository=new CustomerRepositoryImpl();
        customerRepository.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("msg","Them moi thanh cong");
        return "redirect:/customer";
    }
    @GetMapping("/search")
    public String searchCustomer (@RequestParam("search") String search,Model model){
        CustomerRepository customerRepository=new CustomerRepositoryImpl();
        model.addAttribute("customerSearhList",customerRepository.findCustomerByName(search));
        return "result";
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id){
        CustomerRepository customerRepository=new CustomerRepositoryImpl();
        customerRepository.removeCustomer(id);
        return "redirect:/customer";
    }


}
