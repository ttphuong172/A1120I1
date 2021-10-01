package com.example.hokhau.service;

import com.example.hokhau.model.NhanKhau;

import java.util.List;
import java.util.Optional;

public interface NhanKhauService {
    List<NhanKhau> selectAllNhanKhau();
    List<NhanKhau> findNhanKhauByHoGiaDinh_HoGiaDinhId(int hoGiaDinhId);
    List<NhanKhau> findNhanKhauByHoGiaDinh_HoGiaDinhIdOrderByQuanHe(int hoGiaDinhId);
    void saveNhanKhau(NhanKhau nhanKhau);
    NhanKhau findNhanKhauById(int nhanKhaiId);
//    List<NhanKhau> searchNhanKhau(String hoten, Optional<Integer> gioitinhid,Optional<Integer> hogiadinhid,Optional<Integer> quanheid,Optional<Integer> duongid);
    List<NhanKhau> searchNhanKhau(String hoten, Optional<Integer> gioitinhid,Optional<Integer> hogiadinhid,Optional<Integer> quanheid,Optional<Integer> duongid, Optional<Integer> beginage, Optional<Integer> endage);
    void deleteNhanKhau(NhanKhau nhanKhau);

}
