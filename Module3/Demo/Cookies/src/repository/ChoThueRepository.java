package repository;

import model.ThueNha;

import java.util.List;

public interface ChoThueRepository {
    List<ThueNha> selectAll();
    void saveThueNha(ThueNha thueNha);
    boolean isExitId(String id);
    List<ThueNha> searchGia(int giaChoThue);
    List<ThueNha> searchDienTich(int dienTich);
}
