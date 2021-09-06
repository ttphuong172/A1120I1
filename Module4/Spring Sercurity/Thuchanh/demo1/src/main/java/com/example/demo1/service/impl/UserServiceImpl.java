package com.example.demo1.service.impl;

import com.example.demo1.dao.TaiKhoanRepository;
import com.example.demo1.model.TaiKhoan;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Override
    public void saveUser(TaiKhoan taiKhoan) {
        taiKhoanRepository.save(taiKhoan);
    }
}
