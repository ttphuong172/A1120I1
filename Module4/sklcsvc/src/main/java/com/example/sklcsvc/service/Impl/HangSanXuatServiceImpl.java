package com.example.sklcsvc.service.Impl;

import com.example.csvc.dao.HangSanXuatRepository;
import com.example.csvc.model.HangSanXuat;
import com.example.csvc.service.HangSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangSanXuatServiceImpl implements HangSanXuatService {
    @Autowired
    private HangSanXuatRepository hangSanXuatRepository;
    @Override
    public List<HangSanXuat> selectAllHangSanXuat() {
        return hangSanXuatRepository.findAll();
    }
}
