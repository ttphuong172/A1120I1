package com.phuongtt.sanpham.service;

import com.phuongtt.sanpham.model.DanhMuc;
import com.phuongtt.sanpham.model.SanPham;
import com.phuongtt.sanpham.repository.DanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DanhMucServiceImpl implements DanhMucService {
    @Autowired
    private DanhMucRepository danhMucRepository;
    @Override
    public List<DanhMuc> selectAllDanhMuc() {

        return danhMucRepository.findAll();
    }

    @Override
    public DanhMuc findDanhMucById(int id) {
        return danhMucRepository.getById(id);
    }

    @Override
    public void saveDanhMuc(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
    }

    @Override
    public void removeDanhMuc(DanhMuc danhMuc) {
        danhMucRepository.delete(danhMuc);
    }

    @Override
    public List<DanhMuc> findByTenDanhMucContaining(String tendanhmuc) {
        return danhMucRepository.findByTenDanhMucContaining(tendanhmuc);
    }


}
