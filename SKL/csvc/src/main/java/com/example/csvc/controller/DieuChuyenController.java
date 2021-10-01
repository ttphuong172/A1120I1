package com.example.csvc.controller;

import com.example.csvc.service.DieuChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dieuchuyen")
public class DieuChuyenController {
    @Autowired
    private DieuChuyenService dieuChuyenService;
    @GetMapping("")
    public String loadDieuChuyen(Model model){
        model.addAttribute("listDieuChuyen",dieuChuyenService.selectAllDieuChuyen());
        return "dieuchuyen/list";
    }
}
