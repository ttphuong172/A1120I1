var fullName='Trần Thanh Phương'
var cmnd='201786374'
var birthDay=new Date(1984,2,17);
var email='ttphuong172@gmail.com';
var address='43 Cẩm Nam 7, Hòa Xuân, Cẩm Lệ, Đà Nẵng';
var custommer='Gold';
var discount=10;
var attach=3;
var rentDays=7;
var services='Villa';
var room='Vip';
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
//     document.getElementById('dpmoney').innerHTML='Số tiền phải trả: '+money+'USD';
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

function save(){
    checkFullName();
    checkCMND();
    checkBirthDay();
    checkRentDay();
    checkEmail()

}
function checkCMND(){

    var inputcmnd=document.getElementById('inputcmnd').value;

    if (isNaN(inputcmnd)) {
        document.getElementById('errorcmnd').innerHTML = 'Vui lòng nhập lại'
        return false
    }else if(inputcmnd.trim().length===0){
            document.getElementById('errorcmnd').innerHTML='Vui lòng nhập số CMND'
            return false
        } else if(parseInt(inputcmnd)<0){
        document.getElementById('errorcmnd').innerHTML='Sai định dạng'
        return false
    }
    else if (inputcmnd.trim().length!==10){
        document.getElementById('errorcmnd').innerHTML='Số CMND phải 10 số'
        return false
    }  else{
        document.getElementById('errorcmnd').innerHTML="";
        return true
    }
}
function checkFullName() {
    var inputFullName= document.getElementById('inputfullname').value
    if(inputFullName.trim().length===0){
        document.getElementById('errorfullname').innerHTML="Vui lòng nhập Họ và tên"
        return false
    } else {
        document.getElementById('errorfullname').innerHTML=""
        return true;
    }
}
function checkRentDay() {
    var inputRentDay=document.getElementById('inputrentdays').value;
    //alert(Number.isInteger(inputRentDay))
    if(inputRentDay.trim().length===0){
        document.getElementById('errorrentdays').innerHTML="Vui lòng nhập ngày cần thuê"
    } else if(isNaN(inputRentDay)){
        document.getElementById('errorrentdays').innerHTML="Vui lòng nhập số"
    }else if(inputRentDay<1){
        document.getElementById('errorrentdays').innerHTML="Số ngày phải lớn hơn 0"
    }
    else{
        document.getElementById('errorrentdays').innerHTML=""
    }
}
function checkBirthDay(){

    var birthDay=document.getElementById('inputbirthday').value;
    if(birthDay.trim().length===0){
        document.getElementById('errorbirthday').innerHTML="Vui lòng nhập ngày"
        return false
    }else if(birthDay.trim().length!==10){
        document.getElementById('errorbirthday').innerHTML="Sai định dàng ngày"
        return false
    }
    else if ((birthDay[2]!=='/') || (birthDay[5]!=='/')){
        document.getElementById('errorbirthday').innerHTML="Sai định dàng ngày"
        return false
    } else{
        if (birthDay.substring(0,2)>31){
            document.getElementById('errorbirthday').innerHTML="Ngày quá lớn"
            return false
        }else if(birthDay.substring(3,5)>12){
            document.getElementById('errorbirthday').innerHTML="Tháng quá lớn"
            return false
        } else if((birthDay.substring(6,11)>2020)||(birthDay.substring(6,11)<1920)){
            document.getElementById('errorbirthday').innerHTML="Năm không đúng"
            return false
        }
        else{
            document.getElementById('errorbirthday').innerHTML=""
            return true
        }
    }
}
    document.getElementById('inputcmnd').addEventListener("blur",checkCMND)
    document.getElementById('inputfullname').addEventListener("blur",checkFullName)
    document.getElementById('inputfullname').addEventListener("blur",autoCorrect)
    document.getElementById('inputbirthday').addEventListener("blur",checkBirthDay)
    document.getElementById('inputrentdays').addEventListener("blur",checkRentDay)
    document.getElementById('inputemail').addEventListener("blur",checkEmail)
//Tu dong chuan hoa du lieu
function autoCorrect(){
    var inputFullName= document.getElementById('inputfullname').value.toLowerCase().trim();

    myString=inputFullName[0].toUpperCase();
    for(i=1;i<inputFullName.length;i++){
        if (inputFullName[i-1]===' '){
            myString+=' '+inputFullName[i].toUpperCase()
        } else{
            myString+=inputFullName[i]
        }
    }
    //Bieu thuc chinh quy, chua hoc
    myString=myString.replace(/\s+/g, ' ')
    document.getElementById('inputfullname').value=myString
}

function checkEmail(){
    var email=document.getElementById('inputemail').value;
    var posa=email.indexOf('@')
    var posdot=email.lastIndexOf('.')
    if(posa>posdot){
        document.getElementById('erroremail').innerHTML="Vui lòng nhập lại email";
        return false
    } else
        document.getElementById('erroremail').innerHTML="";
        return true
}