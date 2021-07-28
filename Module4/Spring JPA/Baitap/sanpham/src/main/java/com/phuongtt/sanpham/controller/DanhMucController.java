package com.phuongtt.sanpham.controller;

import com.phuongtt.sanpham.model.DanhMuc;
import com.phuongtt.sanpham.service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Service
@RequestMapping("/danhmuc")
public class DanhMucController {
    @Autowired
    private DanhMucService danhMucService;
    @GetMapping("")
    public String indexDanhMuc(Model model){
        model.addAttribute("danhMucList",danhMucService.selectAllDanhMuc());
        return "danhmuc/list";
    }
    @GetMapping("/edit/{id}")
    public String editDanhMuc(@PathVariable int id, Model model){
        model.addAttribute("danhMuc",danhMucService.findDanhMucById(id));
        return "danhmuc/edit";
    }
    @PostMapping("/update")
    public String updateDanhMuc(DanhMuc danhMuc, RedirectAttributes redirectAttributes){
        danhMucService.saveDanhMuc(danhMuc);
        redirectAttributes.addFlashAttribute("msg","Cap nhat thanh cong");
        return "redirect:/danhmuc";
    }
    @GetMapping("/create")
    public String createDanhMuc(Model model){
        model.addAttribute("danhMuc", new DanhMuc());
        return "danhmuc/create";
    }
    @PostMapping("/save")
    public  String saveDanhMuc(DanhMuc danhMuc,RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg","Them moi thanh cong");
        danhMucService.saveDanhMuc(danhMuc);
        return "redirect:/danhmuc";
    }
    @GetMapping("/delete/{id}")
    public String deleteDanhMuc(@PathVariable int id,Model model){
        model.addAttribute("danhMuc",danhMucService.findDanhMucById(id));
        return "danhmuc/delete";
    }
    @PostMapping("/remove")
    public String removeDanhMuc(DanhMuc danhMuc,RedirectAttributes redirectAttributes){
        danhMucService.removeDanhMuc(danhMuc);
        redirectAttributes.addFlashAttribute("msg","Xoa thanh cong");
        return "redirect:/danhmuc";
    }
    @GetMapping("/search")
    public String searchDanhMuc (@RequestParam ("tendanhmuc") String tendanhmuc,Model model){
        model.addAttribute("danhMucSearch", danhMucService.findByTenDanhMucContaining(tendanhmuc));
        return "danhmuc/search";
    }

}
