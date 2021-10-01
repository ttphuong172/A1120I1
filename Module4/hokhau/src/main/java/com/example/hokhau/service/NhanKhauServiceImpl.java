package com.example.hokhau.service;

import com.example.hokhau.dao.NhanKhauRepository;
import com.example.hokhau.model.NhanKhau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanKhauServiceImpl implements NhanKhauService {
    @Autowired
    private NhanKhauRepository nhanKhauRepository;
    @Override
    public List<NhanKhau> selectAllNhanKhau() {
        return nhanKhauRepository.selectAllNhanKhau();
    }

    @Override
    public List<NhanKhau> findNhanKhauByHoGiaDinh_HoGiaDinhId(int hoGiaDinhId) {
        return nhanKhauRepository.findNhanKhauByHoGiaDinh_HoGiaDinhId(hoGiaDinhId);
    }

    @Override
    public List<NhanKhau> findNhanKhauByHoGiaDinh_HoGiaDinhIdOrderByQuanHe(int hoGiaDinhId) {
        return nhanKhauRepository.findNhanKhauByHoGiaDinh_HoGiaDinhIdOrderByQuanHe(hoGiaDinhId);
    }

    @Override
    public void saveNhanKhau(NhanKhau nhanKhau) {
        nhanKhauRepository.save(nhanKhau);
    }

    @Override
    public NhanKhau findNhanKhauById(int nhanKhaiId) {
        return nhanKhauRepository.findById(nhanKhaiId).orElse(null);
    }

    @Override
    public List<NhanKhau> searchNhanKhau(String hoten, Optional<Integer> gioitinhid,Optional<Integer> hogiadinhid,Optional<Integer> quanheid,Optional<Integer> duongid, Optional<Integer> beginage, Optional<Integer> endage) {
//        return nhanKhauRepository.searchNhanKhau(hoten,gioitinhid,hogiadinhid, quanheid,duongid);
        return nhanKhauRepository.searchNhanKhau(hoten,gioitinhid,hogiadinhid, quanheid,duongid,beginage,endage);
    }

    @Override
    public void deleteNhanKhau(NhanKhau nhanKhau) {
        nhanKhauRepository.delete(nhanKhau);
    }


}
