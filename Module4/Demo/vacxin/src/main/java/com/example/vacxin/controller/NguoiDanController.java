package com.example.vacxin.controller;

import com.example.vacxin.model.NguoiDan;
import com.example.vacxin.service.DuongService;
import com.example.vacxin.service.NguoiDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class NguoiDanController {
    @Autowired
    private NguoiDanService nguoiDanService;
    @Autowired
    private DuongService duongService;

    @GetMapping("")
    public String loadNguoiDan(Model model) {
        model.addAttribute("nguoiDan", new NguoiDan());
        model.addAttribute("duongList", duongService.selectAllDuong());
        model.addAttribute("nguoiDanList", nguoiDanService.findAllByOrderByIdNguoiDanDesc());
        return "list";
    }

    @PostMapping("save")
    public String saveNguoiDan(@Valid NguoiDan nguoiDan, BindingResult bindingResult, Model model) {
        new NguoiDan().validate(nguoiDan, bindingResult);
        if (bindingResult.hasErrors()) {

            model.addAttribute("duongList", duongService.selectAllDuong());
            model.addAttribute("nguoiDanList", nguoiDanService.findAllByOrderByIdNguoiDanDesc());
            return "list";
        }
        nguoiDanService.saveNguoiDan(nguoiDan);
        return "redirect:/";
    }
}
