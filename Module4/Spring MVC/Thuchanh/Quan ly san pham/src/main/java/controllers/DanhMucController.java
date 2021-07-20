package controllers;

import model.DanhMuc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import repository.DanhMucRepository;
import repository.DanhMucRepositoryImpl;

@Controller
@RequestMapping("/danhmuc")
public class DanhMucController {
    @GetMapping("/list")
    public String getDanhMuc(Model model){
        DanhMucRepository danhMucRepository=new DanhMucRepositoryImpl();
        model.addAttribute("listDanhMuc",danhMucRepository.selectAllDanhMuc());
        return "/danhmuc/list";
    }
    @GetMapping("/create")
    public String createDanhMuc(Model model){
        model.addAttribute("danhMuc", new DanhMuc());
        return "/danhmuc/add";
    }
    @PostMapping("/save")
    public String saveDanhMuc(@ModelAttribute DanhMuc danhMuc, RedirectAttributes redirectAttributes){
        DanhMucRepository danhMucRepository=new DanhMucRepositoryImpl();
        danhMucRepository.saveDanhMuc(danhMuc);

        redirectAttributes.addFlashAttribute("msg",
                "Create new successfully!");

        return "redirect:/danhmuc/list";
    }
    @GetMapping("/edit/{id}")
    public String editDanhMuc(@PathVariable int id,Model model){
        DanhMucRepository danhMucRepository=new DanhMucRepositoryImpl();
        model.addAttribute("danhMuc",danhMucRepository.getDanhMucById(id));
        return "danhmuc/edit";
    }
    @PostMapping("/update")
    public String updateDanhMuc(@ModelAttribute DanhMuc danhMuc){
        DanhMucRepository danhMucRepository=new DanhMucRepositoryImpl();
        danhMucRepository.updateDanhMuc(danhMuc);
        return  "redirect:/danhmuc/list";
    }
    @GetMapping("/delete/{id}")
    public String deleteDanhMuc(@PathVariable int id){
        DanhMucRepository danhMucRepository=new DanhMucRepositoryImpl();
        danhMucRepository.deleteDanhMuc(id);
        return  "redirect:/danhmuc/list";
    }
}
