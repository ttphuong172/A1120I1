package controllers;

import model.EmailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailSettingController {
    @GetMapping("/email")
    public String getIndex(Model model){
        model.addAttribute("emailSetting", new EmailSetting());
        String [] languages={"English","VietNamese","Japanese","Chinese"};
        model.addAttribute("languageList",languages);
        int[] pageSize = {5,10,15,20,25,30,35};
        model.addAttribute("pageSizeList",pageSize);
        return "emailsetting";
    }
    @PostMapping("/update")
    public String updateEmailSetting(@ModelAttribute("emailSetting") EmailSetting emailSetting,Model model){
        model.addAttribute("emailSetting",emailSetting);
        return "result";
    }
}
