package com.example.demo.service.Impl;

import com.example.demo.dao.KhachHangRepository;
import com.example.demo.model.KhachHang;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHang> selectAllKhachHang() {
        return khachHangRepository.findAll();
    }
}
