package com.example.flower.controler;

import com.example.flower.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Service
@RequestMapping("flower")

public class FlowerController {
    @Autowired
    private FlowerService flowerService;
    @GetMapping("")
    public String loadFlower(Model model){
        model.addAttribute("flowerList",flowerService.selectAllFlower());
        return "list";
    }
    @GetMapping("detail/{id}")
    public String detailFlower(@PathVariable int id,Model model){
        model.addAttribute("flower",flowerService.findFlowerById(id));
        return "detail";
    }

}
