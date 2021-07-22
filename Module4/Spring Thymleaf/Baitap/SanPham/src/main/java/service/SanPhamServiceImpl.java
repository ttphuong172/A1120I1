package service;

import model.SanPham;
import repository.SanPhamRepository;
import repository.SanPhamRepositoryImpl;

import java.util.List;

public class SanPhamServiceImpl implements SanPhamService {
    SanPhamRepository sanPhamRepository=new SanPhamRepositoryImpl();
    @Override
    public List<SanPham> selectAllSanPham() {
        return sanPhamRepository.selectAllSanPham();
    }

    @Override
    public void save(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
    }

    @Override
    public SanPham findSanPhamById(int id) {
        return sanPhamRepository.findSanPhamById(id);
    }

    @Override
    public void updateSanPham(SanPham sanPham) {
        sanPhamRepository.updateSanPham(sanPham);
    }

    @Override
    public void removeSanPham(int id) {
        sanPhamRepository.removeSanPham(id);
    }
}
