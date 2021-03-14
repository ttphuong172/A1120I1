package _07_abstract_interface.homework.canbo;

import _06_inhenritance.th.shape.Square;

public class Test {
    public static void main(String[] args) {
        CanBo canbo1=new KySu("Chau",1984,true,"Da Nang","Tieng Anh");
        CanBo canbo2=new CongNhan("Phuong",1984,true,"Quang Nam","3/7");
        QLCB qlcb1=new QLCB();
        qlcb1.themMoiCanBo(canbo1);
        qlcb1.themMoiCanBo(canbo2);
        for(int i=0;i< qlcb1.danhSachCanBo.size();i++){
            System.out.println(qlcb1.danhSachCanBo.get(i));
        }

    }
}
