class TaiLieu {
    constructor(maTaiLieu,nhaXuatBan,soBanPhatHanh) {
        this.maTaiLieu=maTaiLieu;
        this.nhaXuatBan=nhaXuatBan;
        this.soBanPhatHanh=soBanPhatHanh;
    }
    getmaTaiLieu(){
        return this.maTaiLieu
    }
    setmaTaiLieu(maTaiLieu){
        this.maTaiLieu=maTaiLieu
    }
    getnhaXuatBan(){
        return this.nhaXuatBan
    }
    setnhaXuatBan(nhaXuatBan){
        this.nhaXuatBan=nhaXuatBan
    }
    getsoBanPhatHanh(){
        return this.soBanPhatHanh
    }
    setsoBanPhatHanh(soBanPhatHanh){
        this.soBanPhatHanh=soBanPhatHanh
    }
}

class Sach extends TaiLieu{
    constructor(maTaiLieu,nhaXuatBan,soBanPhatHanh,tenTacGia,soTrang) {
        super(maTaiLieu,nhaXuatBan,soBanPhatHanh);
        this.tenTacGia=tenTacGia;
        this.soTrang=soTrang
    }
    gettenTacGia(){
        return this.tenTacGia;
    }
    settenTacGia(tenTacGia){
        this.tenTacGia=tenTacGia
    }
    getsoTrang(){
        return this.soTrang
    }
    setsoTrang(soTrang){
        this.soTrang=soTrang
    }
}
class TapChi extends TaiLieu{
    constructor(maTaiLieu,nhaXuatBan,soBanPhatHanh,soPhatHanh,thangPhatHanh) {
        super(maTaiLieu,nhaXuatBan,soBanPhatHanh);
        this.soPhatHanh=soPhatHanh;
        this.thangPhatHanh=thangPhatHanh
    }
    getsoPhatHanh(){
        return this.soPhatHanh;
    }
    setsoPhatHanh(soPhatHanh){
        this.soPhatHanh=soPhatHanh;
    }
    getthangPhatHanh(){
        return this.thangPhatHanh;
    }
    setthangPhatHanh(thangPhatHanh){
        this.thangPhatHanh=thangPhatHanh;
    }
}
class Bao extends TaiLieu{
    constructor(maTaiLieu,nhaXuatBan,soBanPhatHanh,ngayPhatHanh) {
        super(maTaiLieu,nhaXuatBan,soBanPhatHanh);
        this.ngayPhatHanh=ngayPhatHanh;
    }
    getngayPhatHanh(){
        return this.ngayPhatHanh
    }
    setngayPhatHanh(ngayPhatHanh){
        this.ngayPhatHanh=ngayPhatHanh
    }
}
class QuanLySach{
    constructor() {
        this.listTaiLieu=[];
    }
    themTaiLieu(taiLieu){
        this.listTaiLieu.push(taiLieu);
    }



}
