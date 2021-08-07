package com.example.thuvien.dao;

import com.example.thuvien.model.MuonTraSach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuonTraSachRepository extends JpaRepository<MuonTraSach,Integer> {
    MuonTraSach findByMaMuonTraSach(String mamuontrasach);
    Boolean existsMuonTraSachByMaMuonTraSachAndNgayTraIsNull(String mamuontrasach);

}
