package com.example.hokhau.controller;

import com.example.hokhau.model.HoGiaDinh;
import com.example.hokhau.service.DuongService;
import com.example.hokhau.service.HoGiaDinhService;
import com.example.hokhau.service.NhanKhauService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Optional;

@Controller
@RequestMapping("hogiadinh")
public class HoGiaDinhController {
    @Autowired
    private HoGiaDinhService hoGiaDinhService;
    @Autowired
    private NhanKhauService nhanKhauService;
    @Autowired
    private DuongService duongService;
    @GetMapping("")
    public String loadHoGiaDinh(Model model,HttpServletRequest request){
        model.addAttribute("duongList",duongService.selectAllDuong());
        model.addAttribute("hoGiaDinhList",hoGiaDinhService.selectAllChuHo());


        return "hogiadinh/list";
    }
    @GetMapping("detail/{hoGiaDinhId}")
    public String detailHoGiaDinh(@PathVariable int hoGiaDinhId,Model model){

        model.addAttribute("hoGiaDinh",hoGiaDinhService.findHoGiaDinhById(hoGiaDinhId));
        model.addAttribute("nhanKhauListById",nhanKhauService.findNhanKhauByHoGiaDinh_HoGiaDinhIdOrderByQuanHe(hoGiaDinhId));
        return "hogiadinh/detail";
    }
    @GetMapping("create")
    public String createHoGiaDinh(Model model){
        model.addAttribute("hoGiaDinh", new HoGiaDinh());
        model.addAttribute("duongList",duongService.selectAllDuong());
        return "hogiadinh/create";
    }
    @PostMapping("save")
    public String saveHoGiaDinh(HoGiaDinh hoGiaDinh, Model model, RedirectAttributes redirectAttributes){
        try{
            hoGiaDinhService.saveHoGiaDinh(hoGiaDinh);
        } catch (DataIntegrityViolationException e){
           redirectAttributes.addFlashAttribute("msg","Hộ bị trùng");
            return "redirect:/hogiadinh";
        }
        return "redirect:/hogiadinh/detail/"+hoGiaDinh.getHoGiaDinhId();
    }
    @GetMapping ("edit/{hoGiaDinhId}")
    public String editHoGiaDinh(@PathVariable int hoGiaDinhId ,Model model,HttpServletRequest request){
        model.addAttribute("url",request.getHeader("referer"));
        model.addAttribute("hoGiaDinh",hoGiaDinhService.findHoGiaDinhById(hoGiaDinhId));
        model.addAttribute("duongList",duongService.selectAllDuong());
        return "hogiadinh/edit";
    }
    @GetMapping("search")
    public String searchHoGiaDinh(@RequestParam String chuhoten, Optional<Integer> duongid,Model model){
        model.addAttribute("chuhoten", chuhoten);
        model.addAttribute("duongid", duongid.orElse(null));
        model.addAttribute("duongList",duongService.selectAllDuong());
        model.addAttribute("hoGiaDinhListSearch",hoGiaDinhService.searchHoGiaDinh(chuhoten,duongid));
        return "hogiadinh/list";
    }
    @GetMapping("delete/{hoGiaDinhId}")
    public String deleteHoGiaDinh(@PathVariable int hoGiaDinhId){
        HoGiaDinh hoGiaDinh = hoGiaDinhService.findHoGiaDinhById(hoGiaDinhId);
//        Xu ly bat loi xoa ho truoc khi xoa nhan khau
        hoGiaDinhService.deleteHoGiaDinh(hoGiaDinh);
        return "redirect:/hogiadinh";
    }



}
