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
    xoaTaiLieu(maTaiLieu){
        for ( let i=0;i<this.listTaiLieu.length;i++){
            if(this.listTaiLieu[i].maTaiLieu==maTaiLieu){
                this.listTaiLieu.splice(i,1)
            }
        }
}
    lietKeTaiLieu(){
        for (let taiLieu of this.listTaiLieu){
        console.log(taiLieu)
        }
    }
    timKiemTaiLieu(){

}
}
var sach1=new Sach('012','Tre',1,'Edison',123)
var tapChi1=new TapChi('112','Tre','1','1',1);
var tapChi2=new TapChi('113','Dai hoc Quoc Gia','1','1',1);
var tapChi3=new TapChi('114','Dai hoc Quoc Gia','1','1',1);
var toBao1=new Bao('115','ThanhNien',12,'12/2/2020')
var thuThu1=new QuanLySach();
thuThu1.themTaiLieu(sach1)
thuThu1.themTaiLieu(tapChi1)
thuThu1.themTaiLieu(tapChi2);
thuThu1.themTaiLieu(tapChi3);
thuThu1.themTaiLieu(toBao1)
thuThu1.xoaTaiLieu('113')
thuThu1.lietKeTaiLieu()

