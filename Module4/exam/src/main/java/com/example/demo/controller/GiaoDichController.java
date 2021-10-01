package com.example.demo.controller;

import com.example.demo.model.GiaoDich;
import com.example.demo.model.LoaiDichVu;
import com.example.demo.service.GiaoDichService;
import com.example.demo.service.Impl.KhachHangServiceImpl;
import com.example.demo.service.KhachHangService;
import com.example.demo.service.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller

public class GiaoDichController {
    @Autowired
    private GiaoDichService giaoDichService;
//    @Autowired
//    private KhachHangService khachHangService;

    KhachHangServiceImpl khachHangService=new KhachHangServiceImpl();


    @Autowired
    private LoaiDichVuService loaiDichVuService;
   @GetMapping("")
    public String loadGiaoDich(Model model){
       model.addAttribute("giaoDichList",giaoDichService.selectAllGiaoDich());
       model.addAttribute("khachHangList",khachHangService.selectAllKhachHang());
       model.addAttribute("loaiDichVuList",loaiDichVuService.selectAllLoaiDichVu());
       return "list";
   }
   @GetMapping("create")
    public String createGiaoDich(Model model){
       model.addAttribute("giaoDich",new GiaoDich());
       model.addAttribute("khachHangList",khachHangService.selectAllKhachHang());
       model.addAttribute("loaiDichVuList",loaiDichVuService.selectAllLoaiDichVu());
       return "create";
   }
   @PostMapping("save")
    public String saveGiaoDich(@Valid GiaoDich giaoDich, BindingResult bindingResult,Model model){
       new GiaoDich().validate(giaoDich,bindingResult);
       if(bindingResult.hasErrors()){
           model.addAttribute("khachHangList",khachHangService.selectAllKhachHang());
           model.addAttribute("loaiDichVuList",loaiDichVuService.selectAllLoaiDichVu());
           return "create";
       }
       giaoDichService.saveGiaoDich(giaoDich);
       return "redirect:/";
   }
   @GetMapping("detail/{maGiaoDich}")
    public String detailGiaoDich(Model model, @PathVariable int maGiaoDich){
       model.addAttribute("giaoDich",giaoDichService.findGiaoDichById(maGiaoDich));
     return "detail";
   }
   @GetMapping("delete/{maGiaoDich}")
    public String deleteGiaoDich (@PathVariable int maGiaoDich){
       GiaoDich giaoDich=giaoDichService.findGiaoDichById(maGiaoDich);
       giaoDichService.deleteGiaoDich(giaoDich);
       return "redirect:/";
   }
    @GetMapping("search")
    public String searchCustomer(@RequestParam String tenkhachhang, Optional<Integer> idloaidichvu, Model model){

        model.addAttribute("tenkhachhang",tenkhachhang);
        model.addAttribute("idLoaiDichVu",idloaidichvu.orElse(null));
        model.addAttribute("loaiDichVuList",loaiDichVuService.selectAllLoaiDichVu());
        model.addAttribute("giaoDichSearchList",giaoDichService.findTenKHAndLoaiDV(tenkhachhang,idloaidichvu));

        return "list";
    }

}
