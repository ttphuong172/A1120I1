package repository;

import model.SanPham;

import java.util.List;

public interface SanPhamRepository {
    List<SanPham> selectAllSanPham();
    void save (SanPham sanPham);
    SanPham findSanPhamById(int id);
    void updateSanPham(SanPham sanPham);
    void removeSanPham(int id);
}
