var arrNameCustomers=[
    ['Tran Thanh Phuong','205115015','ttphuong172@gmail.com','Ha Noi'],
    ['Truong Bao Giang Chau','205115016','ttphuong172@gmail.com','Tokyo'],
    ['Tran Thanh Lam','205115017','ttphuong172@gmail.com','New York']
]
var arrNameCustomers2=sapXep()

function sapXep(){
    for (i=0;i<arrNameCustomers.length;i++){
        console.log(i)
        console.log(getName(arrNameCustomers[i][0]))
        arrNameCustomers[i][4]=getName(arrNameCustomers[i][0])
    }
    return arrNameCustomers.sort(compareBy(4))
}



    function displayCustommer(){
        myString='<table> <tr> <th>Họ và tên</th> <th>CMND</th> <th>Địa chỉ</th> <th></th></tr>'
        for(i=0;i<arrNameCustomers2.length;i++){
            myString+='<tr>'
            for(j=0;j<arrNameCustomers2[0].length-1;j++){
                myString+='<td>'+arrNameCustomers2[i][j]+'</td>'
                console.log(arrNameCustomers2[i][j])
            }
            myString+= ' <td> <button onclick="deleteCustommer('+i+')"> Delete</button> </td>'+'</tr>'
        }
        myString+='</table>'

        console.log(myString)

        document.getElementById('displaycustommer').innerHTML=myString;
        document.getElementById('totalcustommer').innerHTML=arrNameCustomers2.length+' khách hàng';
    }
     function addCustommer(){
        var name=document.getElementById('name').value;
         var cmnd=document.getElementById('cmnd').value;
         var email=document.getElementById('email').value;
         var address=document.getElementById('address').value;
         myArray=[]
         if (checkFullName() && checkCMND()&& checkEmail()) {
             myArray.push(name)
             myArray.push(cmnd);
             myArray.push(email);
             myArray.push(address);
             arrNameCustomers.push(myArray)
             sapXep()
             displayCustommer()
         }
     }

     function deleteCustommer(index) {
        var isDelete=confirm('Bạn có muốn xóa khách hàng'+ arrNameCustomers[index]+'?')
         if(isDelete){
         arrNameCustomers.splice(index,1)
         }
         sapXep()
         displayCustommer()
     }
function compareBy(index) {
    return function (array1, array2) {
        let x = array1[index],
            y = array2[index];

        if (x > y) {
            return 1;
        } else if (x < y) {
            return -1
        } else {
            return 0;
        }
    }
}
function getName(string){
    var index;
    for(let i=string.length;i>0;i--){
        if (string[i]===' '){
            index=i
            break;
        }
    }
    return string.substring(string.length,index+1)
}

document.getElementById('name').addEventListener("blur",checkFullName);
document.getElementById('name').addEventListener("blur",autoCorrect);
document.getElementById('cmnd').addEventListener("blur",checkCMND)
document.getElementById('email').addEventListener("blur",checkEmail)
document.getElementById('email').addEventListener("blur",autoCorrectEmail)

function checkFullName() {
    var inputFullName= document.getElementById('name').value
    if(inputFullName.trim().length===0){
        document.getElementById('errorname').innerHTML="Vui lòng nhập Họ và tên"
        return false
    } else {
        document.getElementById('errorname').innerHTML=""
        return true;
    }
}
function autoCorrect(){
    var inputFullName= document.getElementById('name').value.toLowerCase().trim();
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
    document.getElementById('name').value=myString
}
function checkCMND(){

    var inputcmnd=document.getElementById('cmnd').value;

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
function checkEmail(){
    var email=document.getElementById('email').value;
    var posa=email.indexOf('@')
    var posdot=email.lastIndexOf('.')
    if (email.length===0){
        document.getElementById('erroremail').innerHTML="Vui lòng nhập lại email";
        return false
    } else if((posa===-1 ||posdot===-1)){
        document.getElementById('erroremail').innerHTML="Vui lòng nhập lại email đúng dịnh dạng";
        return false
    } else if (posa>posdot){
        document.getElementById('erroremail').innerHTML="Vui lòng nhập lại email đúng dịnh dạng";
        return false
    } else
        document.getElementById('erroremail').innerHTML="";
    return true
}
function  autoCorrectEmail() {
    var inputFullName= document.getElementById('email').value.toLowerCase().trim();
    document.getElementById('email').value=inputFullName;
}