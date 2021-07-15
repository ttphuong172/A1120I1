package controllers;

import model.DanhMuc;
import model.SanPham;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.SanPhamRepository;
import repository.SanPhamRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SanPhamController {
    @GetMapping("/sanpham")
    public ModelAndView showList() {
        SanPhamRepository sanPhamRepository = new SanPhamRepositoryImpl();
        List<SanPham> sanPhamList=sanPhamRepository.selectAllSanPham();
        ModelAndView modelAndView = new ModelAndView("/list", "listSanPham",sanPhamList );
        return modelAndView;
    }
}
