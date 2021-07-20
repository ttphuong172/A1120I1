package controllers;

import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.LoginRepository;
import repository.LoginRepositoryImpl;

@Controller
public class UserController {
    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("login", new Login());
        return "home";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("login")Login login,Model model){
        LoginRepository loginRepository= new LoginRepositoryImpl();
        User user = loginRepository.checkLogin(login);
        if(user==null){
            return "error";
        } else{
            model.addAttribute("user",user);
            return "user";
        }

    }

}
