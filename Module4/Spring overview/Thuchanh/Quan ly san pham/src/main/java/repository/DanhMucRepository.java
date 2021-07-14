package repository;

import model.DanhMuc;

import java.util.List;

public interface DanhMucRepository {
    List<DanhMuc> selectAllDanhMuc();
    DanhMuc getDanhMucById(int idDanhMuc);
}
