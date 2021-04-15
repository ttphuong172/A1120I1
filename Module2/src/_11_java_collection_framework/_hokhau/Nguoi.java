package _11_java_collection_framework._hokhau;

public class Nguoi {
    private String hoTen;
    private int age;
    private String ngheNghiep;
    private long cmnd;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int age, String ngheNghiep, long cmnd) {
        this.hoTen = hoTen;
        this.age = age;
        this.ngheNghiep = ngheNghiep;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public long getCmnd() {
        return cmnd;
    }

    public void setCmnd(long cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", age=" + age +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", cmnd=" + cmnd +
                '}';
    }
}
