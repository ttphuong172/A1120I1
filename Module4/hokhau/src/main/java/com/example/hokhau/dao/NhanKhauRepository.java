package com.example.hokhau.dao;

import com.example.hokhau.model.NhanKhau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface NhanKhauRepository extends JpaRepository<NhanKhau,Integer> {
    @Query("SELECT n FROM NhanKhau n WHERE (n.hoTen like %:hoten%) and (:gioitinhid is null or n.gioiTinh.gioiTinhId=:gioitinhid) and (:hogiadinhid is null or n.hoGiaDinh.hoGiaDinhId=:hogiadinhid) and (:quanheid is null or n.quanHe.quanHeId=:quanheid) and (:duongid is null or n.hoGiaDinh.duong.duongId=:duongid)  and (:beginage is null or :endage is null or n.age between :beginage and :endage) ORDER BY n.hoGiaDinh.duong.duongId,n.hoGiaDinh.soNha,n.hoGiaDinh.hoGiaDinhTen ,n.quanHe.quanHeId,n.ngaySinh")
    List<NhanKhau> searchNhanKhau(@Param("hoten") String hoten, @Param("gioitinhid") Optional<Integer> gioitinhid,@Param("hogiadinhid") Optional<Integer> hogiadinhid,@Param("quanheid") Optional<Integer> quanheid,@Param("duongid") Optional<Integer> duongid,@Param("beginage")  Optional<Integer> beginage, @Param("endage")  Optional<Integer> endage);
    List<NhanKhau> findNhanKhauByHoGiaDinh_HoGiaDinhId(int hoGiaDinhId);
    List<NhanKhau> findNhanKhauByHoGiaDinh_HoGiaDinhIdOrderByQuanHe(int hoGiaDinhId);
    @Query("SELECT n from NhanKhau n ORDER BY n.hoGiaDinh.duong.duongId,n.hoGiaDinh.soNha,n.hoGiaDinh.hoGiaDinhTen ,n.quanHe.quanHeId,n.ngaySinh")
    List<NhanKhau> selectAllNhanKhau();
}
