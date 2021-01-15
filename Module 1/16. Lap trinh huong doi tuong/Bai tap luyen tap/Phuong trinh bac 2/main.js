class PTBH{
    constructor(a,b,c) {
        this.a=a;
        this.b=b;
        this.c=c
    }
    tinhDelta(){
        return this.b*this.b-4*this.a*this.c
    }
    timNghiem(){
        if (this.tinhDelta()<0){
            alert('Phuong trinh vo nghiem')
        } else if (this.tinhDelta()===0){
            alert('Phuong trinh co nghiem kep')
        } else{
            alert('Phuong trinh co 2 nghiem')
        }
    }
    hoanThien(){
        return this.a+'x2+'+this.b+'x+'+this.c+'=0'
    }
}
 function timNghiem(){
    var a=document.getElementById('a').value;
    var b=document.getElementById('b').value;
    var c=document.getElementById('c').value;

    var phuongTrinhTemp=new PTBH(a,b,c)
     phuongTrinhTemp.timNghiem()
 }


