package com.example.thuvien.controller;

import com.example.thuvien.model.MuonTraSach;
import com.example.thuvien.model.Sach;
import com.example.thuvien.service.MuonTraSachService;
import com.example.thuvien.service.SachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Random;

@Controller
@RequestMapping("sach")

public class SachController {
    @Autowired
    private SachService sachService;
    @Autowired
    private MuonTraSachService muonTraSachService;

    @GetMapping("")
    public String loadSach(Model model) {
        model.addAttribute("sachList", sachService.selectAllSach());
        return "list";
    }

    @GetMapping("/muonsach/{id}")
    public String muonSach(@PathVariable int id, Model model) {
        model.addAttribute("sach", sachService.findSachById(id));
        return "muonsach";
    }

    @GetMapping("/xacnhanmuonsach/{id}")
    public String xacnhanmuonsach(@PathVariable int id, Model model) {
        Sach sach = sachService.findSachById(id);
        MuonTraSach muonTraSach = new MuonTraSach();
        if (sach.getSoLuong() > 0) {
            sach.setSoLuong(sach.getSoLuong() - 1);
            LocalDateTime now = LocalDateTime.now();
            muonTraSach.setNgayMuon(now);
            String numberRandom = String.valueOf(new Random().nextInt(99999 - 10000 + 1) + 10000);
            muonTraSach.setMaMuonTraSach(numberRandom);
            muonTraSachService.saveMuonTraSach(muonTraSach);
            model.addAttribute("msg", "Muon thanh cong");
            model.addAttribute("numberRandom", numberRandom);
        } else {
            model.addAttribute("msg", "Muon khong thanh cong");
        }

        return "ketquamuonsach";
    }

    @GetMapping("/trasach/{id}")
    public String traSach(@PathVariable int id, Model model) {
        model.addAttribute("sach", sachService.findSachById(id));
        return "trasach";
    }

    @GetMapping("/xacnhantrasach/{id}")
    public String xacnhantrasach(@PathVariable int id, @RequestParam("mamuontrasach") String mamuontrasach, Model model) {
        Sach sach = sachService.findSachById(id);
        MuonTraSach muonTraSach = muonTraSachService.findByMaMuonTraSach(mamuontrasach);
        if (muonTraSachService.existsMuonTraSachByMaMuonTraSachAndNgayTraIsNull(mamuontrasach)) {
            sach.setSoLuong(sach.getSoLuong() + 1);
            LocalDateTime now = LocalDateTime.now();
            muonTraSach.setNgayTra(now);
            muonTraSachService.saveMuonTraSach(muonTraSach);
            model.addAttribute("msg", "Tra sach thanh cong");
        } else {
            model.addAttribute("msg", "Tra sach khong thanh cong");
        }
        return "ketquatrasach";

    }


}
