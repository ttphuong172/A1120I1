package com.example.hokhau.dao;

import com.example.hokhau.model.HoGiaDinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface HoGiaDinhRepository extends JpaRepository<HoGiaDinh,Integer> {
    @Query("SELECT h FROM HoGiaDinh h WHERE (h.hoGiaDinhTen like %:chuhoten%) and (:duongid is null or h.duong.duongId=:duongid) ORDER BY h.soNha, h.duong.duongId")
    List<HoGiaDinh> searchHoGiaDinh(@Param("chuhoten") String chuhoten, @Param("duongid") Optional<Integer> duongid);
    List<HoGiaDinh> findAllByOrderByDuongAscSoNhaAsc();
}
