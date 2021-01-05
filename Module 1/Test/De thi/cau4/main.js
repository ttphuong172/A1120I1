var custommer=[]
var customer1={
    id:1,
    name: 'Tran Thanh Phuong',
    tel: '0915010414',
    address: 'Quang Nam',
    email:'ttphuong172@gmail.com'
}
var customer2={
    id:2,
    name: 'Truong Bao Giang Chau',
    tel: '0935326684',
    address: 'Quang Nam',
    email:'chau.truongbg@gmail.com'
}
custommer.push(customer1);
custommer.push(customer2);

function displayCustommer(){
    myString='<table border="1">'
    for(i=0;i<custommer.length;i++){
        console.log(custommer[i].name);
        console.log(custommer[i].class);
        console.log(custommer[i].age);
        myString+='<tr> <td>'+custommer[i].id+'</td>'+ '<td>'+custommer[i].name+'</td>'+'<td>' +custommer[i].tel+'</td>'+'<td>'+custommer[i].address+'</td>' + '<td>'+custommer[i].email+'</td> </tr>';
    }
    myString+='</table>'
    document.getElementById('result').innerHTML=myString;
    console.log(myString);
}
function addCustommer(){
    var id=document.getElementById('id').value;
    var name=document.getElementById('name').value;
    var tel=document.getElementById('tel').value;
    var address=document.getElementById('address').value;
    var email=document.getElementById('email').value;
    var customertemp={}
    customertemp.name=name;
    custommer.push(customertemp)
    displayCustommer()
}

displayCustommer()
