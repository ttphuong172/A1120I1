package com.example.csvc.controller;

import com.example.csvc.model.ThietBi;
import com.example.csvc.model.ViTri;
import com.example.csvc.service.HangSanXuatService;
import com.example.csvc.service.ThietBiService;
import com.example.csvc.service.ViTriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("thietbi")
public class ThietBiController {
    @Autowired
    private ThietBiService thietBiService;

    @Autowired
    private HangSanXuatService hangSanXuatService;
    @Autowired
    private ViTriService viTriService;
    @GetMapping("")
    public String loadThietBi(Model model){
        model.addAttribute("thietBiList", thietBiService.selectAllThietBi());
        return "thietbi/list";
    }
    @GetMapping("create/{idViTri}")
    public String createThietBi(@PathVariable int idViTri, Model model){
        model.addAttribute("thietBi", new ThietBi());
        model.addAttribute("tenViTri",viTriService.findViTriById(idViTri).getTenViTri());
        model.addAttribute("hangSanXuatList", hangSanXuatService.selectAllHangSanXuat());
        return "thietbi/create";
    }
    @PostMapping("save")
    public String saveThietBi(ThietBi thietBi){
        thietBiService.saveThietBi(thietBi);
        return "redirect:/vitri/detail/" + thietBi.getViTri().getIdViTri() ;
    }
//    @PostMapping("predelete")
//    @ResponseBody
//    public List<ThietBi> predeleteThietBi(@RequestParam (value = "idThietBiList[]") Integer[] idThietBiList){
//        List<ThietBi> thietBiList=new ArrayList<>();
//        for (Integer idThietBi:idThietBiList){
//            thietBiList.add(thietBiService.findThietBiById(idThietBi));
//        }
//        return thietBiList;
//    }
    @PostMapping("delete")
    public String deleteThietBi(@RequestParam (value = "idDeleteList[]") Integer[] idDeleteList){
        for (Integer idDelete:idDeleteList){
            thietBiService.deleteThietBi(thietBiService.findThietBiById(idDelete));
        }
        return "redirect:/vitri/detail/1";
    }
    @PostMapping("forward")
    public String forwardThietBi(@RequestParam (value = "idForwardList[]") Integer[] idForwardList, Integer idvitri){
        ViTri viTri=viTriService.findViTriById(idvitri);
        for (Integer idForward:idForwardList){
           ThietBi thietBi=thietBiService.findThietBiById(idForward);
           thietBi.setViTri(viTri);
           thietBiService.saveThietBi(thietBi);
        }
        return "redirect:/vitri/detail/1";
    }
    @GetMapping("edit/{idThietBi}")
    public String editThietBi(@PathVariable int idThietBi, Model model){
        model.addAttribute("viTriList", viTriService.selectAllViTri());
        model.addAttribute("hangSanXuatList", hangSanXuatService.selectAllHangSanXuat());
        model.addAttribute("thietBi", thietBiService.findThietBiById(idThietBi));
        return "thietbi/edit";
    }

}
