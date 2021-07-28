package com.phuongtt.sanpham.controller;

import com.phuongtt.sanpham.model.DanhMuc;
import com.phuongtt.sanpham.model.SanPham;
import com.phuongtt.sanpham.service.DanhMucService;
import com.phuongtt.sanpham.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Service
@RequestMapping("/sanpham")
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;
    @Autowired
    private DanhMucService danhMucService;
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("sanPhamList",sanPhamService.selectAllSanPham());
        return "sanpham/list";
    }
    @GetMapping("/edit/{id}")
    public String editSanPham(@PathVariable int id, Model model){
        model.addAttribute("sanPham",sanPhamService.findSanPhamById(id));
        model.addAttribute("danhMucList",danhMucService.selectAllDanhMuc());

        return "sanpham/edit";
    }
    @PostMapping("/update")
    public String updateSanPham(SanPham sanPham){
        sanPhamService.saveSanPham(sanPham);
        return "redirect:/sanpham";
    }

    @GetMapping("/create")
    public String createSanPham(Model model){
        model.addAttribute("danhMuc", new DanhMuc());
        model.addAttribute("sanPham",new SanPham());
        model.addAttribute("danhMucList",danhMucService.selectAllDanhMuc());
        return "sanpham/create";
    }
    @PostMapping("/save")
    public String saveSanPham(SanPham sanPham){
        sanPhamService.saveSanPham(sanPham);
        return "redirect:/sanpham";
    }
    @GetMapping("/delete/{id}")
    public String deleteSanPham (@PathVariable int id,Model model){
        model.addAttribute("sanPham",sanPhamService.findSanPhamById(id));
        model.addAttribute("danhMucList",danhMucService.selectAllDanhMuc());
        return "sanpham/delete";
    }
    @GetMapping("/remove")
    public String removeSanPham(SanPham sanPham){
        sanPhamService.removeSanPham(sanPham);
        return "redirect:/sanpham";
    }
    @GetMapping("/search")
    public String searchSanPham(@RequestParam("ten") String ten, Model model ){
        model.addAttribute("searchList",sanPhamService.findByTenContaining(ten));
        return "sanpham/search";
    }



}
