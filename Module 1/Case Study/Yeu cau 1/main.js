/**
 * Created by admin on 12/14/2020.
 */
    var disCount=document.getElementById('discount');
    var rentDays=document.getElementById('rentdays');
    var services=document.getElementById('services');


function display(){

    document.getElementById('dpfullname').innerHTML='Họ và tên: '+document.getElementById('fullname').value;
    document.getElementById('dpcmnd').innerHTML='CMND: '+document.getElementById('cmnd').value;

    var birthDay=new Date(document.getElementById('birthday').value);
    //alert( parseInt(birthDay.getMonth())+1 );
    document.getElementById('dpbirthday').innerHTML=('Ngay sinh: '+birthDay.getDate()+'/'+(parseInt(birthDay.getMonth()) + 1)+'/'+birthDay.getFullYear());
    document.getElementById('dpemail').innerHTML='Email: '+document.getElementById('email').value;
    document.getElementById('dpaddress').innerHTML='Địa chỉ: '+document.getElementById('address').value;


    var thanhVien = custommer.options[custommer.selectedIndex];
    document.getElementById('dpcustommer').innerHTML='Thành viên: '+thanhVien.text;

    document.getElementById('dpdiscount').innerHTML='Giảm giá: '+document.getElementById('discount').value;
    document.getElementById('dpattach').innerHTML='Số người đi kèm: '+document.getElementById('attach').value;
    document.getElementById('dprentdays').innerHTML='Số ngày thuê: '+document.getElementById('rentdays').value;

    var dichVu=services.options[services.selectedIndex];
    document.getElementById('dpservices').innerHTML='Loại dịch vụ: '+dichVu.text;

    var loaiPhong=rooms.options[rooms.selectedIndex];
    document.getElementById('dprooms').innerHTML='Loại phòng: '+loaiPhong.text;

    var money=services.value * rentDays.value*(1-(disCount.value/100));
    document.getElementById('dpmoney').innerHTML='Số tiền phải trả: '+money+'USD';
}
