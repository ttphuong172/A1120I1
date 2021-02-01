class Customer {
    constructor(id, name, tel, address, email) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.email = email
    }

    getId() {
        return this.id;
    }

    setID(id) {
        this.id = id;
    }

    getName() {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    getTel() {
        return this.tel;
    }

    setTel(tel) {
        this.tel = tel;
    }

    getAddress() {
        this.address
    }

    setAddress(address) {
        this.address = address;
    }

    getEmail() {
        return this.email;
    }

    setEmail(email) {
        this.email = email;
    }
}

class ManageCustomer {
    constructor() {
        this.listCustommer = [];
    }

    addCustomer(customer) {
        this.listCustommer.push(customer)
    }

    displayCustomer() {
        var myString='<table border="1"> <tr><th>Ma khach hang</th><th>Ten khach hang</th><th>So dien thoai</th><th>Dia chi</th><th>Email</th></tr>'
        for(let i=0;i<this.listCustommer.length;i++){
            myString+='<tr><td>'+this.listCustommer[i].id+'</td><td>'+this.listCustommer[i].name+'</td><td>'+this.listCustommer[i].tel+'</td><td>'+this.listCustommer[i].address+'</td><td>'+this.listCustommer[i].email+'</td></tr>'
        }
        myString+='</table>'
        document.getElementById('result').innerHTML=myString;
    }
}
var manageCustommerTemp=new ManageCustomer();
function addCustomer() {
    var id=document.getElementById('id').value;
    var name=document.getElementById('name').value;
    var tel=document.getElementById('tel').value;
    var address=document.getElementById('address').value;
    var email=document.getElementById('email').value;
    var customerTemp=new Customer(id,name,tel,address,email);
    manageCustommerTemp.addCustomer(customerTemp);
    manageCustommerTemp.displayCustomer()
}


