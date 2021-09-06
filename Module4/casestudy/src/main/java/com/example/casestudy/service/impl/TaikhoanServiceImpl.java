package com.example.casestudy.service.impl;

import com.example.casestudy.dao.TaiKhoanRepository;
import com.example.casestudy.service.TaikhoanService;
import org.springframework.beans.factory.annotation.Autowired;

public class TaikhoanServiceImpl implements TaikhoanService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
}
