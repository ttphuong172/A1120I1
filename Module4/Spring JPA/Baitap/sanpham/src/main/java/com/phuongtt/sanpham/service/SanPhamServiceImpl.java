package com.phuongtt.sanpham.service;

import com.phuongtt.sanpham.model.SanPham;
import com.phuongtt.sanpham.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;
    @Override
    public List<SanPham> selectAllSanPham() {
        return sanPhamRepository.findAll();
    }

    @Override
    public SanPham findSanPhamById(int id) {
        return sanPhamRepository.getById(id);
    }

    @Override
    public void saveSanPham(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
    }

    @Override
    public void removeSanPham(SanPham sanPham) {
        sanPhamRepository.delete(sanPham);
    }

    @Override
    public List<SanPham> findByTenContaining(String ten) {
        return sanPhamRepository.findByTenContaining(ten);
    }
}
