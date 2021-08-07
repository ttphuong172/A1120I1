package com.example.thuvien.service;

import com.example.thuvien.model.MuonTraSach;

import java.util.List;

public interface MuonTraSachService {
    List<MuonTraSach> selectAllMuonTraSach();
    void saveMuonTraSach(MuonTraSach muonTraSach);
    Boolean existsMuonTraSachByMaMuonTraSachAndNgayTraIsNull(String mamuontrasach);
    MuonTraSach findByMaMuonTraSach(String mamuontrasach);

}
