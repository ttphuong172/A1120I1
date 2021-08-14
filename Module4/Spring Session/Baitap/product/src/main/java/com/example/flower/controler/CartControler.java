package com.example.flower.controler;

import com.example.flower.model.Cart;
import com.example.flower.model.Flower;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("cart")
public class CartControler {
    @GetMapping("")
    public String loadCart(@SessionAttribute("flowerListCart")List<Cart> flowerListCart, Model model){
        model.addAttribute("flowerListCart",flowerListCart);
        return "cart";
    }

}
