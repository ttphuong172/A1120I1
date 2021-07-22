package controller;

import model.SanPham;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.SanPhamService;
import service.SanPhamServiceImpl;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {
    @GetMapping("")
    public String getList(Model model){
        SanPhamService sanPhamService=new SanPhamServiceImpl();
        model.addAttribute("sanPhamList", sanPhamService.selectAllSanPham());
        return "list";
    }
    @GetMapping("/create")
    public String createSanPham(Model model){
        model.addAttribute("sanPham", new SanPham());
        return "create";
    }
    @PostMapping("/save")
    public String saveSanPham(SanPham sanPham, RedirectAttributes redirectAttributes){
        SanPhamService sanPhamService=new SanPhamServiceImpl();
        sanPhamService.save(sanPham);
        redirectAttributes.addFlashAttribute("msg","Them moi thanh cong");
        return "redirect:/sanpham";
    }
    @GetMapping("/edit/{id}")
    public String editSanPham(@PathVariable int id, Model model){
        SanPhamService sanPhamService=new SanPhamServiceImpl();
        model.addAttribute("sanPham",sanPhamService.findSanPhamById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String updateSanPham(SanPham sanPham,RedirectAttributes redirectAttributes){
        SanPhamService sanPhamService=new SanPhamServiceImpl();
        sanPhamService.updateSanPham(sanPham);
        redirectAttributes.addFlashAttribute("msg","Cap nhat thanh cong");
        return "redirect:/sanpham";
    }
    @GetMapping("/delete/{id}")
    public String deleteSanPham(@PathVariable int id, Model model){
        SanPhamService sanPhamService=new SanPhamServiceImpl();
        model.addAttribute("sanPham",sanPhamService.findSanPhamById(id));
        return "delete";
    }
    @PostMapping("/remove")
    public String removeSanPham(SanPham sanPham, RedirectAttributes redirectAttributes){
        SanPhamService sanPhamService=new SanPhamServiceImpl();
        sanPhamService.removeSanPham(sanPham.getId());
        redirectAttributes.addFlashAttribute("msg","Xoa thanh cong");
        return "redirect:/sanpham";
    }
}
