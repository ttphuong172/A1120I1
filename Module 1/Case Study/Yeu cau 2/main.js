var fullName='Tran Thanh Phuong'
var cmnd='201786374'
var birthDay=new Date(1984,2,17);
var email='ttphuong172@gmail.com';
var address='43 Cam Nam 7, Hoa Xuan, Cam Le, Da Nang';
var custommer='Gold';
var discount=10;
var attach=3;
var rentDays=3;
var services='Villa'
var room='Vip'
function display(){
    document.getElementById('dpfullname').innerHTML=('Họ và tên: '+fullName);


    document.getElementById('dpcmnd').innerHTML='CMND: '+ cmnd;

    //var birthDay=new Date(document.getElementById('birthday').value);
    //alert( parseInt(birthDay.getMonth())+1 );
    document.getElementById('dpbirthday').innerHTML=('Ngày sinh: '+birthDay.getDate()+'/'+parseInt(birthDay.getMonth()) +'/'+birthDay.getFullYear());
    document.getElementById('dpemail').innerHTML='Email: '+ email;
    document.getElementById('dpaddress').innerHTML='Địa chỉ: '+address;
    document.getElementById('dpcustommer').innerHTML='Thành viên: '+custommer;
    document.getElementById('dpdiscount').innerHTML='Giảm giá: '+discount+'%';
    document.getElementById('dpattach').innerHTML='Số người đi kèm: '+attach;
    document.getElementById('dprentdays').innerHTML='Số ngày thuê: '+ rentDays;
//
//     var dichVu=services.options[services.selectedIndex];
     document.getElementById('dpservices').innerHTML='Loại dịch vụ: '+services;
//
//     var loaiPhong=rooms.options[rooms.selectedIndex];
     document.getElementById('dprooms').innerHTML='Loại phòng: '+room;
//
//     var money=services.value * rentDays.value*(1-(disCount.value/100));
//     document.getElementById('dpmoney').innerHTML='Số tiền phải trả: '+money+'USD';
}
function edit() {
    document.getElementById('editname').value=fullName;


}