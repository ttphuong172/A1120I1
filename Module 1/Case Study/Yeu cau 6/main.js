class  Customer{
    constructor(fullName,id,birthDay,email,address,customers,discount,attach,rentDays,services,rooms) {
        this.fullName=fullName;
        this.id=id;
        this.birthDay=birthDay;
        this.email=email;
        this.address=address;
        this.customers=customers;
        this.discount=discount;
        this.attach=attach;
        this.rentDays=rentDays;
        this.services=services;
        this.rooms=rooms
    }
    getFullName(){
        return this.fullName;
    }
    setFullName(fullName){
        this.fullName=fullName;
    }
    getId(){
        return this.id;
    }
    setId(id){
        this.id=id;
    }
    getBirthDay(){
        return this.birthDay;
    }
    setBirthDay(birthDay){
        this.birthDay=birthDay;
    }
    getEmail(){
        return this.email;
    }
    setEmail(email){
        this.email=email;
    }
    getAddress(){
        return this.address
    }
    setAddress(address){
        this.address=address
    }
    getCustomers(){
        return this.customers
    }
    setCustomers(customers){
        this.customers=customers
    }
    getDiscount(){
        return this.discount;
    }
    setDiscount(discount){
        this.discount=discount;
    }
    getAttach(){
        return this.discount;
    }
    setAttach(attach){
        this.attach=attach
    }
    getRentDays(){
        return this.rentDays
    }
    setRentDays(rentDays){
        this.rentDays=rentDays;
    }
    getServices(){
        return this.services;
    }
    setServices(services){
        this.services=services;
    }
    getRooms(){
        return this.rooms;
    }
    setRooms(rooms){
        this.rooms=rooms
    }
}
var listCustomer=[];
var custommer1=new Customer('Tran Thanh Phuong',205115015,'17/02/1984','ttphuong172@gmail.com','Da Nang','diamond',10,4,4,'house','vip')
listCustomer.push(custommer1)
function addCustomer() {
    myCustomer=new Customer()
    var fullName=document.getElementById('fullname').value;
    myCustomer.setFullName(fullName)
    var id=document.getElementById('id').value;
    myCustomer.setId(id)
    var birthDay=document.getElementById('birthday').value;
    myCustomer.setBirthDay(birthDay);
    var email=document.getElementById('email').value;
    myCustomer.setEmail(email);
    var address=document.getElementById('address').value;
    myCustomer.setAddress(address);
    var customers=document.getElementById('custommers').value;
    myCustomer.setCustomers(customers)
    var discount=document.getElementById('discount').value;
    myCustomer.setDiscount(discount);
    var attach=document.getElementById('attach').value;
    myCustomer.setAttach(attach);
    var rentDays=document.getElementById('rentdays').value;
    myCustomer.setRentDays(rentDays);
    var services=document.getElementById('services').value;
    myCustomer.setServices(services);
    var rooms=document.getElementById('rooms').value;
    myCustomer.setRooms(rooms)
    if ((checkFullName())&&checkCMND()&&checkBirthDay()&&checkEmail()&&checkAddress()&&checkDiscount()&&checkAttach()&&checkRentDays()){
        listCustomer.push(myCustomer)
    }
    console.log(listCustomer);
    displayCustommer()
}
function displayCustommer() {
    myString = '<table class="tbldisplay" border="1"> <tr><th>Họ và tên</th><th>Số CMND</th> <th>Ngày sinh</th><th>Email</th><th>Địa chỉ</th><th>Loại KH</th><th>Giảm giá %</th><th>Người đi kèm</th><th>Số ngày thuê</th><th>Loại DV</th><th>Loại phòng</th><th></th><th></th><th></th></tr>'
    for (i = 0; i < listCustomer.length; i++) {
        myString += '<tr> <td>' + listCustomer[i].getFullName() + '</td>' + '<td>' + listCustomer[i].getId() + '</td>' + '<td>' + listCustomer[i].getBirthDay() + '</td>' + '<td>' + listCustomer[i].getEmail() + '</td>' + '<td>' + listCustomer[i].getAddress() +'</td>'
        myString=myString+ '<td>' + listCustomer[i].getCustomers() +'</td>'
        myString=myString+'<td>' + listCustomer[i].getDiscount() +'</td>'+ '<td>' + listCustomer[i].getAttach() +'</td>'+ '<td>' + listCustomer[i].getRentDays()+ '<td>' + listCustomer[i].getServices()+'</td>'+ '<td>' + listCustomer[i].getRooms()+'<td><button>VIEW</button></td>'+ '</td>' + '<td> <button>EDIT</button> </td>'+'<td><button>DELETE</button></td>' +'</tr>';
    }
    myString += '</table>'
    console.log(myString)
    document.getElementById('result').innerHTML = myString;
}

function checkFullName() {
    var inputFullName= document.getElementById('fullname').value
    if(inputFullName.trim().length===0){
        document.getElementById('errorfullname').innerHTML="Vui lòng nhập Họ và tên"
        return false
    } else {
        document.getElementById('errorfullname').innerHTML=""
        return true;
    }
}

function autoCorrectName(){
    var fullName= document.getElementById('fullname').value
    if (fullName.length===0){

    } else{
    inputFullName= fullName.toLowerCase().trim();

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
    document.getElementById('fullname').value=myString
}
}

function checkBirthDay(){

    var birthDay=document.getElementById('birthday').value;
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
function checkCMND(){
    var inputcmnd=document.getElementById('id').value;
    if (isNaN(inputcmnd)) {
            document.getElementById('errorid').innerHTML = 'Vui lòng nhập lại CMND'
            return false
    } else if (inputcmnd.length==0) {
            document.getElementById('errorid').innerHTML = 'Vui lòng nhập CMND'
            return false
    } else if((inputcmnd<100000000) || (inputcmnd>999999999)){
        document.getElementById('errorid').innerHTML = 'Xem lại số CMND'
        return false
    } else{
        document.getElementById('errorid').innerHTML="";
        return true
    }
}
function checkEmail(){
    var email=document.getElementById('email').value;
    var posa=email.indexOf('@')
    var posdot=email.lastIndexOf('.')
    if (email.length===0){
        document.getElementById('erroremail').innerHTML="Vui lòng nhập email";
        return false
    } else if (posa>posdot){
        document.getElementById('erroremail').innerHTML="Vui lòng nhập lại email đúng dịnh dạng";
        return false
    } else
        document.getElementById('erroremail').innerHTML="";
    return true
}
function checkAddress() {
    var address=document.getElementById('address').value;
    if(address.length==0){
        document.getElementById('erroraddress').innerHTML="Vui lòng nhập địa chỉ";
        return false
    } else{
        document.getElementById('erroraddress').innerHTML='';
        return true;
    }


}
function autoCorrectAddress(){
    var addresstemp= document.getElementById('address').value
    if (addresstemp.length===0){

    }else{
    var address= addresstemp.toLowerCase().trim();
    myString=address[0].toUpperCase();
    for(i=1;i<address.length;i++){
        if (address[i-1]===' '){
            myString+=' '+address[i].toUpperCase()
        } else{
            myString+=address[i]
        }
    }
    //Bieu thuc chinh quy, chua hoc
    myString=myString.replace(/\s+/g, ' ')
    document.getElementById('address').value=myString
}
}
function checkDiscount(){
    var discount=document.getElementById('discount').value;
    if (isNaN(discount)){
        document.getElementById('errordiscount').innerHTML='Vui lòng nhập sô'
        return false
    } else if((discount<0)||(discount>100)) {
        document.getElementById('errordiscount').innerHTML='Giá trị discount từ 0-100';
        return false
    }
    else{
        document.getElementById('errordiscount').innerHTML='';
        return true
    }

}
function checkAttach(){
    var attach=document.getElementById('attach').value;
    if(isNaN(attach)){
        document.getElementById('errorattach').innerHTML='Vui lòng nhập số';
        return false
    } else if ((attach<0)||(attach>4)){
        document.getElementById('errorattach').innerHTML='Số người đi kèm không quá 4';
        return false
    } else {
        document.getElementById('errorattach').innerHTML='';
        return true
    }
}
function checkRentDays(){
    var rentDays=document.getElementById('rentdays').value;
    if(isNaN(rentDays)){
        document.getElementById('errorrentdays').innerHTML='Vui lòng nhập số';
        return false
    } else if(rentDays<0){
        document.getElementById('errorrentdays').innerHTML='Số ngày thuê lớn hơn 0'
        return  false
    } else{
        document.getElementById('errorrentdays').innerHTML=''
        return  true;
    }
}

document.getElementById('fullname').addEventListener("blur",checkFullName)
document.getElementById('fullname').addEventListener("blur",autoCorrectName)
document.getElementById('id').addEventListener("blur",checkCMND)
document.getElementById('birthday').addEventListener("blur",checkBirthDay)
document.getElementById('email').addEventListener("blur",checkEmail)
document.getElementById('address').addEventListener("blur",autoCorrectAddress)
document.getElementById('address').addEventListener("blur",checkAddress)
document.getElementById('discount').addEventListener("blur",checkDiscount)
document.getElementById('attach').addEventListener("blur",checkAttach)
document.getElementById('rentdays').addEventListener("blur",checkRentDays)