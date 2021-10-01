package com.example.hokhau.controller;

import com.example.hokhau.model.NhanKhau;
import com.example.hokhau.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("nhankhau")
public class NhanKhauController {
    @Autowired
    private NhanKhauService nhanKhauService;
    @Autowired
    private GioiTinhService gioiTinhService;
    @Autowired
    private HoGiaDinhService hoGiaDinhService;
    @Autowired
    private QuanHeService quanHeService;
    @Autowired
    private DuongService duongService;
    @GetMapping("")
    public String loadNhanKhau(Model model) {
        model.addAttribute("nhanKhauList", nhanKhauService.selectAllNhanKhau());
        model.addAttribute("gioiTinhList",gioiTinhService.selectAllGioiTinh());
        model.addAttribute("hoGiaDinhList",hoGiaDinhService.selectAllChuHo());
        model.addAttribute("quanHeList",quanHeService.selectAllQuanHe());
        model.addAttribute("duongList",duongService.selectAllDuong());
        return "nhankhau/list";
    }
    @GetMapping("create/{hoGiaDinhId}")
    public String createNhanKhau(@PathVariable int hoGiaDinhId,Model model){
        model.addAttribute("hoGiaDinhId",hoGiaDinhId);
        model.addAttribute("hoGiaDinhTen",hoGiaDinhService.findHoGiaDinhById(hoGiaDinhId).getHoGiaDinhTen());
        model.addAttribute("nhanKhau", new NhanKhau());
        model.addAttribute("hoGiaDinhList",hoGiaDinhService.selectAllChuHo());
        model.addAttribute("gioiTinhList",gioiTinhService.selectAllGioiTinh());
        model.addAttribute("quanHeList",quanHeService.selectAllQuanHe());
        return "nhankhau/create";
    }
    @PostMapping("save")
    public String saveNhanKhau(@Valid NhanKhau nhanKhau, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        new NhanKhau().validate(nhanKhau, bindingResult);
        if(bindingResult.hasErrors()){
            int hoGiaDinhId=nhanKhau.getHoGiaDinh().getHoGiaDinhId();
            model.addAttribute("hoGiaDinhId",hoGiaDinhId);
            model.addAttribute("hoGiaDinhTen",hoGiaDinhService.findHoGiaDinhById(hoGiaDinhId).getHoGiaDinhTen());
            model.addAttribute("hoGiaDinhList",hoGiaDinhService.selectAllChuHo());
            model.addAttribute("gioiTinhList",gioiTinhService.selectAllGioiTinh());
            model.addAttribute("quanHeList",quanHeService.selectAllQuanHe());
            return "nhankhau/create";
        }
        try{
            nhanKhauService.saveNhanKhau(nhanKhau);
        } catch (DataIntegrityViolationException e){
            redirectAttributes.addFlashAttribute("msg","Nhân khẩu bị trùng");
        }
        int nhanKhauId=nhanKhau.getHoGiaDinh().getHoGiaDinhId();
        String url="/hogiadinh/detail/"+nhanKhauId;
        return "redirect:/hogiadinh/detail/"+ nhanKhauId;
    }

    @GetMapping("detail/{nhanKhauId}")
    public String detailNhanKhau(Model model,@PathVariable int nhanKhauId,HttpServletRequest request){
//        Lay thong tin server
        String serverName=request.getServerName();
        int serverPort=request.getServerPort();
        int hoGiaDinhId=nhanKhauService.findNhanKhauById(nhanKhauId).getHoGiaDinh().getHoGiaDinhId();
        String urlDetail = "http://" + serverName+ ":"+ serverPort +"/hogiadinh/detail/" + hoGiaDinhId;
        model.addAttribute("urlDetail",urlDetail);

        model.addAttribute("nhanKhau",nhanKhauService.findNhanKhauById(nhanKhauId));
        return "nhankhau/detail";
    }
    @GetMapping("edit/{nhanKhauId}")
    public String editNhanKhau(Model model,@PathVariable int nhanKhauId, HttpServletRequest request){
        model.addAttribute("url",request.getHeader("referer"));
        model.addAttribute("nhanKhau",nhanKhauService.findNhanKhauById(nhanKhauId));
        model.addAttribute("hoGiaDinhList",hoGiaDinhService.selectAllChuHo());
        model.addAttribute("gioiTinhList",gioiTinhService.selectAllGioiTinh());
        model.addAttribute("quanHeList",quanHeService.selectAllQuanHe());
        return "nhankhau/edit";
    }
    @GetMapping("search")
    public String searchNhanKhau(@RequestParam String hoten, Optional<Integer> gioitinhid,Optional<Integer> hogiadinhid,Optional<Integer> quanheid,Optional<Integer> duongid,Optional<Integer> beginage,Optional<Integer> endage, Model model){
        model.addAttribute("hoten",hoten);
        model.addAttribute("gioitinhid",gioitinhid.orElse(null));
        model.addAttribute("hogiadinhid",hogiadinhid.orElse(null));
        model.addAttribute("quanheid",quanheid.orElse(null));
        model.addAttribute("duongid",duongid.orElse(null));
        model.addAttribute("beginage",beginage.orElse(null));
        model.addAttribute("endage",endage.orElse(null));
        model.addAttribute("gioiTinhList",gioiTinhService.selectAllGioiTinh());
        model.addAttribute("hoGiaDinhList",hoGiaDinhService.selectAllChuHo());
        model.addAttribute("quanHeList",quanHeService.selectAllQuanHe());
        model.addAttribute("duongList",duongService.selectAllDuong());
        model.addAttribute("nhanKhauListSearch", nhanKhauService.searchNhanKhau(hoten,gioitinhid,hogiadinhid,quanheid,duongid,beginage,endage));
        return "nhankhau/list";
    }
    @GetMapping("delete/{nhanKhauId}")
    public String deleteNhanKhau(@PathVariable int nhanKhauId){
        NhanKhau nhanKhau=nhanKhauService.findNhanKhauById(nhanKhauId);
        nhanKhauService.deleteNhanKhau(nhanKhau);
        return "redirect:/hogiadinh";
    }

}
