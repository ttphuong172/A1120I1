package _11_java_collection_framework._hokhau;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HoGiaDinh {
    private int soThanhVien;
    private String diaChi;
    private ArrayList<Nguoi> listThanhVien = new ArrayList<>();

    public HoGiaDinh() {
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ArrayList<Nguoi> getListThanhVien() {
        return listThanhVien;
    }

    public void setListThanhVien(ArrayList<Nguoi> listThanhVien) {
        this.listThanhVien = listThanhVien;
    }

    public HoGiaDinh(int soThanhVien, String diaChi, ArrayList<Nguoi> listThanhVien) {
        this.soThanhVien = soThanhVien;
        this.diaChi = diaChi;
        this.listThanhVien = listThanhVien;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "soThanhVien=" + soThanhVien +
                ", diaChi='" + diaChi + '\'' +
                ", listThanhVien=" + listThanhVien +
                '}';
    }
}

