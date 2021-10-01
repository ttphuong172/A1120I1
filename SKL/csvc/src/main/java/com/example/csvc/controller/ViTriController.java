package com.example.csvc.controller;

import com.example.csvc.model.Khu;
import com.example.csvc.model.ViTri;
import com.example.csvc.service.CoSoService;
import com.example.csvc.service.KhuService;
import com.example.csvc.service.ViTriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("vitri")
public class ViTriController {
    @Autowired
    private ViTriService viTriService;
    @Autowired
    private KhuService khuService;
    @Autowired
    private CoSoService coSoService;
    @GetMapping("detail/{idViTri}")
    public String detailViTri(@PathVariable int idViTri, Model model){

        model.addAttribute("viTri",viTriService.findViTriById(idViTri));
        model.addAttribute("coSoList",coSoService.selectAllCoSo());
        model.addAttribute("viTriList",viTriService.selectAllViTri());
        return "vitri/detail";
    }
    @GetMapping("create/{idKhu}")
    public String createViTri(@PathVariable int idKhu, Model model){
        model.addAttribute("idKhu",idKhu);
        model.addAttribute("tenKhu",khuService.findKhuById(idKhu).getTenKhu());
        model.addAttribute("viTri", new ViTri());
        return "vitri/create";
    }
    @PostMapping("save")
    public String saveViTri(ViTri viTri){
        viTriService.saveViTri(viTri);
        return "redirect:/khu/detail/" + viTri.getKhu().getIdKhu();
    }
    @GetMapping("edit/{idViTri}")
    public String editViTri(@PathVariable int idViTri,Model model){
        model.addAttribute("khuList",khuService.selectAllKhu());
        model.addAttribute("viTri",viTriService.findViTriById(idViTri));
        return "vitri/edit";
    }

    @PostMapping("getvitri")
    @ResponseBody
    public List<ViTri> getViTri(Integer idkhu){
        System.out.println(idkhu);
        return viTriService.findAllByKhu_IdKhu(idkhu);
    }

}
