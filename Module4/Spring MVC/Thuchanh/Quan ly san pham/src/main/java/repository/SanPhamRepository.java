package repository;

import model.SanPham;

import java.util.List;

public interface SanPhamRepository {
    List <SanPham> selectAllSanPham();
    void  save(SanPham sanPham);
    SanPham findSanPhamById(int id);
    void update(int id, SanPham sanPham);
    List<SanPham> findSanPhamByName(String tenSanPham);
}
