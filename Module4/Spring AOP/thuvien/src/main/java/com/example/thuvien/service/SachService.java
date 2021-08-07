package com.example.thuvien.service;

import com.example.thuvien.model.MuonTraSach;
import com.example.thuvien.model.Sach;

import java.util.List;

public interface SachService {
    List<Sach> selectAllSach();
    Sach findSachById(int id);
    void saveSach(Sach sach);

}
