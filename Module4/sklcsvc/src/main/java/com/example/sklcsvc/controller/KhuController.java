package com.example.sklcsvc.controller;

import com.example.csvc.model.Khu;
import com.example.csvc.model.ViTri;
import com.example.csvc.service.CoSoService;
import com.example.csvc.service.KhuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("khu")
public class KhuController {
    @Autowired
    private KhuService khuService;
    @Autowired
    private CoSoService coSoService;
    @GetMapping("")
    public String loadKhu(Model model){
        model.addAttribute("khuList",khuService.selectAllKhu());
        return "khu/list";
    }
    @GetMapping("detail/{idKhu}")
    public String detailKhu(@PathVariable int idKhu, Model model){
//        model.addAttribute("idKhu",idKhu);
        List<ViTri> viTriList = khuService.findKhuById(idKhu).getViTriList();
        Collections.sort(viTriList);

       model.addAttribute("viTriList",viTriList);
       model.addAttribute("khu",khuService.findKhuById(idKhu));
        return "khu/detail";
    }
    @GetMapping("create")
    public String createKhu(Model model){
        model.addAttribute("khu", new Khu());
        model.addAttribute("coSoList",coSoService.selectAllCoSo());
        return "khu/create";
    }
    @PostMapping("save")
    public String saveKhu(Khu khu){
        khuService.saveKhu(khu);
        return "redirect:/khu";
    }
    @GetMapping("edit/{idKhu}")
    public String editKhu(@PathVariable int idKhu,Model model){
        model.addAttribute("khu", khuService.findKhuById(idKhu));
        model.addAttribute("coSoList",coSoService.selectAllCoSo());
        return "khu/edit";
    }
    @PostMapping("update")
    public String updateKhu(Khu khu){
        khuService.saveKhu(khu);
        return "redirect:/khu/detail/" + khu.getIdKhu();
    }
}
