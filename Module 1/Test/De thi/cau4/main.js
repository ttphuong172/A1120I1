var custommer=[]
function Custommer(id,name,tel,address,email){
    this.id=id;
    this.name=name;
    this.tel=tel;
    this.address=address;
    this.email=email;
}

var customer1=new Custommer('1','Tran Thanh Phuong','0915010414','Quang Nam','ttphuong172@gmail.com')

custommer.push(customer1);


function displayCustommer(){
    myString='<table border="1">'
    for(i=0;i<custommer.length;i++){
        console.log(custommer[i].id);
        console.log(custommer[i].name);
        console.log(custommer[i].tel);
        console.log(custommer[i].address);
        console.log(custommer[i].email);
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
    var customertemp=new Custommer();
    customertemp.id=id;
    customertemp.name=name;
    customertemp.tel=tel
    customertemp.address=address
    customertemp.email=email
    custommer.push(customertemp)
    displayCustommer()
}

displayCustommer()
