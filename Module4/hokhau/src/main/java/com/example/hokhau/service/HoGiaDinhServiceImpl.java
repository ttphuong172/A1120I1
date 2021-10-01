package com.example.hokhau.service;

import com.example.hokhau.dao.HoGiaDinhRepository;
import com.example.hokhau.model.HoGiaDinh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoGiaDinhServiceImpl implements HoGiaDinhService {
    @Autowired
    private HoGiaDinhRepository hoGiaDinhRepository;
    @Override
    public List<HoGiaDinh> selectAllChuHo() {
        return hoGiaDinhRepository.findAllByOrderByDuongAscSoNhaAsc();
    }

    @Override
    public HoGiaDinh findHoGiaDinhById(int hoGiaDinhId) {
        return hoGiaDinhRepository.findById(hoGiaDinhId).orElse(null);
    }

    @Override
    public void saveHoGiaDinh(HoGiaDinh hoGiaDinh) {
        hoGiaDinhRepository.save(hoGiaDinh);
    }

    @Override
    public List<HoGiaDinh> searchHoGiaDinh(String chuhoten, Optional<Integer> duongit) {
        return hoGiaDinhRepository.searchHoGiaDinh(chuhoten,duongit);
    }

    @Override
    public void deleteHoGiaDinh(HoGiaDinh hoGiaDinh) {
        hoGiaDinhRepository.delete(hoGiaDinh);
    }
}
