package com.example.thuvien.service;

import com.example.thuvien.dao.MuonTraSachRepository;
import com.example.thuvien.model.MuonTraSach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuonTraSachServiceImpl implements MuonTraSachService {
    @Autowired
    private MuonTraSachRepository muonTraSachRepository;

    @Override
    public List<MuonTraSach> selectAllMuonTraSach() {
        return null;
    }

    @Override
    public void saveMuonTraSach(MuonTraSach muonTraSach) {
        muonTraSachRepository.save(muonTraSach);
    }

    @Override
    public Boolean existsMuonTraSachByMaMuonTraSachAndNgayTraIsNull(String mamuontrasach) {
        return muonTraSachRepository.existsMuonTraSachByMaMuonTraSachAndNgayTraIsNull(mamuontrasach);
    }

    @Override
    public MuonTraSach findByMaMuonTraSach(String mamuontrasach) {
        return muonTraSachRepository.findByMaMuonTraSach(mamuontrasach);
    }


}
