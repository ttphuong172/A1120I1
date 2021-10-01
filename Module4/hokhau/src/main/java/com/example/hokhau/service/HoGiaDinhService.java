package com.example.hokhau.service;

import com.example.hokhau.model.HoGiaDinh;

import java.util.List;
import java.util.Optional;

public interface HoGiaDinhService {
    List<HoGiaDinh> selectAllChuHo();
    HoGiaDinh findHoGiaDinhById(int hoGiaDinhId);
    void saveHoGiaDinh(HoGiaDinh hoGiaDinh);
    List<HoGiaDinh> searchHoGiaDinh(String chuhoten, Optional<Integer> duongit);
    void deleteHoGiaDinh (HoGiaDinh hoGiaDinh);

}
