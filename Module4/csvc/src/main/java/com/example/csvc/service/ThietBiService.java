package com.example.csvc.service;

import com.example.csvc.model.ThietBi;

import java.util.List;

public interface ThietBiService {
    List<ThietBi> selectAllThietBi();
    void saveThietBi(ThietBi thietBi);
    ThietBi findThietBiById(int idThietBi);
    void deleteThietBi(ThietBi thietBi);
}
