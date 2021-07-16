package controllers;

import model.DanhMuc;
import model.SanPham;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import repository.DanhMucRepository;
import repository.DanhMucRepositoryImpl;
import repository.SanPhamRepository;
import repository.SanPhamRepositoryImpl;

import java.util.List;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {
    @GetMapping("/list")
    public ModelAndView showList() {
        SanPhamRepository sanPhamRepository = new SanPhamRepositoryImpl();
        List<SanPham> sanPhamList=sanPhamRepository.selectAllSanPham();
        ModelAndView modelAndView = new ModelAndView("sanpham/list", "listSanPham",sanPhamList );
        return modelAndView;
    }
    @GetMapping("/create")
    public String showCreate(Model model){

        DanhMucRepository danhMucRepository=new DanhMucRepositoryImpl();
        model.addAttribute("sanPham",new SanPham());
//        model.addAttribute("listDanhMuc",danhMucRepository.selectAllDanhMuc());
        String mang []={"Dien thoai","Tivi"};
        model.addAttribute("listDanhMuc",mang);
        return "sanpham/add";
    }

    @PostMapping("/save")
    public String saveSanpham(@ModelAttribute SanPham sanPham,@ModelAttribute DanhMuc danhMuc, RedirectAttributes redirectAttributes){
        SanPhamRepository sanPhamRepository = new SanPhamRepositoryImpl();
        sanPhamRepository.save(sanPham);
        redirectAttributes.addFlashAttribute("msg",
                "Create new successfully!");

        return "redirect:/sanpham/list";
    }
}
