package com.example.demo.service.Impl;

import com.example.demo.dao.GiaoDichRepository;
import com.example.demo.model.GiaoDich;
import com.example.demo.service.GiaoDichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiaoDichServiceImpl implements GiaoDichService {
    @Autowired
    private GiaoDichRepository giaoDichRepository;
    @Override
    public List<GiaoDich> selectAllGiaoDich() {
        return giaoDichRepository.findAll();
    }

    @Override
    public void saveGiaoDich(GiaoDich giaoDich) {
        giaoDichRepository.save(giaoDich);
    }

    @Override
    public GiaoDich findGiaoDichById(int maGiaoDich) {
        return giaoDichRepository.findById(maGiaoDich).orElse(null);
    }

    @Override
    public void deleteGiaoDich(GiaoDich giaoDich) {
        giaoDichRepository.delete(giaoDich);
    }

    @Override
    public List<GiaoDich> findTenKHAndLoaiDV(String tenKhachHang, Optional<Integer> idLoaiDichVu) {
        return giaoDichRepository.findTenKHAndLoaiDV(tenKhachHang,idLoaiDichVu);
    }
}
