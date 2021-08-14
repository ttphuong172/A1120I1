package com.example.flower.controler;

import com.example.flower.model.Cart;
import com.example.flower.model.Flower;
import com.example.flower.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("flower")
@SessionAttributes("flowerListCart")
public class FlowerController {
    @Autowired
    private FlowerService flowerService;

    @ModelAttribute("flowerListCart")
    public List<Cart> createflowerListCart() {
        return new ArrayList<>();
    }

    @GetMapping("")
    public String loadFlower(Model model) {
        model.addAttribute("flowerList", flowerService.selectAllFlower());
        return "list";
    }

    @GetMapping("detail/{id}")
    public String detailFlower(@PathVariable int id, Model model) {
        model.addAttribute("flower", flowerService.findFlowerById(id));
        return "detail";
    }

}
