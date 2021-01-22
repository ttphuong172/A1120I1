var fullName='Trần Thanh Phương'
var cmnd='201786374'
var birthDay=new Date(1984,2,17);
var email='ttphuong172@gmail.com';
var address='43 Cẩm Nam 7, Hòa Xuân, Cẩm Lệ, Đà Nẵng';
var custommer='Gold';
var discount=10;
var attach=3;
var rentDays=3;
var services='Villa'
var room='Vip'
function display(){
     document.getElementById('fullname').innerHTML=fullName;
     document.getElementById('cmnd').innerHTML=cmnd;

    // //var birthDay=new Date(document.getElementById('birthday').value);
    // //alert( parseInt(birthDay.getMonth())+1 );
     document.getElementById('birthday').innerHTML=(birthDay.getDate()+'/'+parseInt(birthDay.getMonth()) +'/'+birthDay.getFullYear());
     document.getElementById('email').innerHTML= email;
     document.getElementById('address').innerHTML=address;
     document.getElementById('custommer').innerHTML=custommer;
     document.getElementById('discount').innerHTML=discount+'%';
     document.getElementById('attach').innerHTML=attach;
     document.getElementById('rentdays').innerHTML=rentDays;
//     var dichVu=services.options[services.selectedIndex];
     document.getElementById('services').innerHTML=services;
//     var loaiPhong=rooms.options[rooms.selectedIndex];
     document.getElementById('room').innerHTML=room;
//     var money=services.value * rentDays.value*(1-(disCount.value/100));
//     document.getElementById('dpmoney').inn erHTML='Số tiền phải trả: '+money+'USD';
}

function edit() {
    document.getElementById('fullname').value=fullName;
    document.getElementById('cmnd').value=cmnd
    document.getElementById('birthday').value=birthDay

}
function save() {

    fullName ="Le Van Luong";
    alert(fullName)

}

function bill(){

    document.getElementById('fullname').innerHTML=fullName;
    document.getElementById('cmnd').innerHTML=cmnd;

    var roomPrice;
    var discountRentDays;
    var discountCustommer;


    if(services==='Villa'){
        roomPrice=500;
    } else if (services==='House'){
        roomPrice=300;
    } else if (services==='Room'){
        roomPrice=100;
    }


    if (rentDays>7){
        discountRentDays=30;
    } else if (rentDays>4){
        discountRentDays=20;
    } else if (rentDays>2){
        discountRentDays=10;
    }


     if (custommer==='Diamond'){
         discountCustommer =15;
     } else if(custommer==='Platium'){
         discountCustommer=10;
     } else if (custommer==='Gold'){
         discountCustommer=5;
     } else if (custommer==='Silver'){
         discountCustommer=2;
     }

    var resultNoDiscount=roomPrice*rentDays;
    var result = roomPrice*rentDays-discountRentDays-discountCustommer;

    document.getElementById('resultnodiscount').innerHTML=resultNoDiscount + ' USD';
    document.getElementById('discountrentdays').innerHTML=discountRentDays + ' USD (' + rentDays+' ngày)';
    document.getElementById('discountcustommer').innerHTML=discountCustommer + ' USD ('+custommer+')';
    document.getElementById('result').innerHTML=result + ' USD';
}
