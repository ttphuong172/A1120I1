package com.example.vacxin.service;

import com.example.vacxin.dao.NguoiDanRepository;
import com.example.vacxin.model.NguoiDan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NguoiDanServiceImpl implements NguoiDanService {
    @Autowired
    private NguoiDanRepository nguoiDanRepository;


    @Override
    public List<NguoiDan> findAllByOrderByIdNguoiDanDesc() {
        return nguoiDanRepository.findAllByOrderByIdNguoiDanDesc();
    }

    @Override
    public void saveNguoiDan(NguoiDan nguoiDan) {
        nguoiDanRepository.save(nguoiDan);
    }
}
