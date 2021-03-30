package _07_abstract_interface.homework.canbo;

import java.util.ArrayList;

public class QLCB {
    ArrayList<CanBo> danhSachCanBo = new ArrayList<CanBo>();

    public void themMoiCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    public void timCanbo(String ten) {
        for (CanBo canBo : danhSachCanBo) {
            if (ten.equals(canBo.getTen())) {
                System.out.println(canBo.toString());
            }
        }
    }

    public void xoaCanBo(String ten) {
        for (int i = 0; i < danhSachCanBo.size(); i++) {
            if (ten.equals(danhSachCanBo.get(i).getTen())) {
                danhSachCanBo.remove(i);
            }
        }
        for (CanBo canBo : danhSachCanBo) {
            System.out.println(canBo);
        }

    }


}


