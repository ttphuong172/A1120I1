class Custommer {
    constructor(name, id, birthDay, address, email, customers, discount, attach, rentDays, services, rooms) {
        this.name = name;
        this.birthDay = birthDay;
        this.id = id;
        this.address = address;
        this.email = email;
        this.customers = customers
        this.discount = discount;
        this.attach = attach;
        this.rentDays = rentDays;
        this.services = services;
        this.rooms = rooms;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getName() {
        return this.name
    }

    setName(name) {
        this.name = name;
    }

    getBirthDay() {
        return this.birthDay;
    }

    setBirthDay(birthDay) {
        this.birthDay = birthDay;
    }

    getAddress() {
        return this.address;
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

    getCustomers() {
        return this.customers
    }

    setCustomers(customers) {
        this.customers = customers;
    }

    getDiscount() {
        return this.discount
    }

    setDiscount(discount) {
        this.discount = discount;
    }

    getAttach() {
        return this.attach
    }

    setAttach(attach) {
        this.attach = attach
    }

    getRentDays() {
        return this.rentDays
    }

    setRentDays(rentDays) {
        this.rentDays = rentDays
    }

    getServices() {
        return this.services
    }

    setServices(services) {
        this.services = services;
    }

    getRooms() {
        return this.rooms
    }

    setRooms(rooms) {
        this.rooms = rooms
    }

}

var listCustommer = []
var customer1 = new Custommer('Tran Thanh Phuong', '205115015', '17/02/1984', 'Hà Nội', 'ttphuong172@gmail.com', 'Gold', 10, 3, 5, 'House', 'Normal')
listCustommer.push(customer1);

function displayCustommer() {
    myString = '<table border="1"> <tr><th>Tên KH</th><th>Số CMND</th><th>Ngày sinh</th><th>Email</th><th>Địa chỉ</th><th>Loại KH</th><th>Giảm giá</th><th>SL đi kèm</th><th>Số ngày thuê</th><th>Loại DV</th><th>Loại phòng</th><th></th><th></th><th></th></tr>'
    for (i = 0; i < listCustommer.length; i++) {
        myString += '<tr> <td>' + listCustommer[i].getName() + '</td>' + '<td>' + listCustommer[i].getId() + '</td>' + '<td>' + listCustommer[i].getBirthDay() + '</td>' + '<td>' + listCustommer[i].getEmail() + '</td>' + '<td>' + listCustommer[i].getAddress() + '</td>' + '<td>' + listCustommer[i].getCustomers() + '</td>' + '<td>' + listCustommer[i].getDiscount() + '</td>' + '<td>' + listCustommer[i].getAttach() + '</td>' + '<td>' + listCustommer[i].getRentDays() + '</td>' + '<td>' + listCustommer[i].getServices() + '</td>' + '<td>' + listCustommer[i].getRooms() + '</td>' + '<td><button onclick="viewInfor(' + i + ')">View</button></td>' + '<td><button onclick="editCustommer(' + i + ')">Edit</button></td>' + '<td><button onclick="deleteCustomer(' + i + ')">Delete</button></td>' + '</tr>';
    }
    myString += '</table>'
    console.log(listCustommer)
    document.getElementById('result').innerHTML = myString;
}

function checkIDAlready() {
    var idHas = false;
    var id = document.getElementById('id').value;
    for (let i = 0; i < listCustommer.length; i++) {
        console.log(id)
        console.log(listCustommer[i].id)
        if (id == listCustommer[i].id) {
            idHas = true
            break
        }
    }
    return idHas
}

function addCustommer() {
    var id = document.getElementById('id').value;
    var name = document.getElementById('name').value;
    var birthDay = document.getElementById('birthday').value;
    var address = document.getElementById('address').value;
    var email = document.getElementById('email').value;
    var index = document.getElementById('index').innerHTML;

    var customerstemp = document.getElementById('customers');
    var customers = customerstemp.options[customerstemp.selectedIndex].text;

    var discount = document.getElementById('discount').value;
    var attach = document.getElementById('attach').value;
    var rentDays = document.getElementById('rentdays').value;

    var servicestemp = document.getElementById('services');
    var services = servicestemp.options[servicestemp.selectedIndex].text;

    var roomstemp = document.getElementById('rooms');
    var rooms = roomstemp.options[roomstemp.selectedIndex].text

    var customertemp = new Custommer();
    if (index != '') {
        alert('Đang ở chế độ chỉnh sửa, vui lòng bấm Cập nhật')
    } else {
        var isAddCustomer = (checkFullName() && checkCMND() && checkBirthDay() && checkEmail() && checkAddress() && checkRentDays() && checkAttach()&&checkDiscount())
        if (isAddCustomer) {
            customertemp.setId(id);
            customertemp.setName(name);
            customertemp.setBirthDay(birthDay)
            customertemp.setAddress(address)
            customertemp.setEmail(email)
            customertemp.setCustomers(customers)
            customertemp.setDiscount(discount)
            customertemp.setAttach(attach)
            customertemp.setRentDays(rentDays)
            customertemp.setServices(services)
            customertemp.setRooms(rooms)
            listCustommer.push(customertemp)
            displayCustommer()
        }
    }

}

function deleteCustomer(index) {
    listCustommer.splice(index, 1)
    displayCustommer()
}

function editCustommer(index) {

    document.getElementById('id').value = listCustommer[index].id
    document.getElementById('name').value = listCustommer[index].name
    document.getElementById('birthday').value = listCustommer[index].birthDay
    if (listCustommer[index].customers === 'Diamond') {
        document.getElementById('customers').value = 'diamond'
    } else if (listCustommer[index].customers === 'Platinum') {
        document.getElementById('customers').value = 'platinum'
    } else if (listCustommer[index].customers === 'Gold') {
        document.getElementById('customers').value = 'gold'
    } else if (listCustommer[index].customers === 'Silver') {
        document.getElementById('customers').value = 'silver'
    } else if (listCustommer[index].customers === 'Member') {
        document.getElementById('customers').value = 'member'
    }
    if (listCustommer[index].services === 'Villa') {
        document.getElementById('services').value = 'villa'
    } else if (listCustommer[index].services === 'House') {
        document.getElementById('services').value = 'house'
    } else if (listCustommer[index].services === 'Room') {
        document.getElementById('services').value = 'room'
    }
    document.getElementById('email').value = listCustommer[index].email
    document.getElementById('address').value = listCustommer[index].address
    document.getElementById('discount').value = listCustommer[index].discount
    document.getElementById('attach').value = listCustommer[index].attach
    document.getElementById('rentdays').value = listCustommer[index].rentDays
    if (listCustommer[index].rooms === 'Vip') {
        document.getElementById('rooms').value = 'vip'
    } else if (listCustommer[index].rooms === 'Business') {
        document.getElementById('rooms').value = 'business'
    } else if (listCustommer[index].rooms === 'Normal') {
        document.getElementById('rooms').value = 'normal'
    }
    document.getElementById('index').innerHTML = index;
}

function updateCustomer(index) {

    var index = document.getElementById('index').innerHTML;
    var isAddCustomer = (checkFullName() && checkCMND() && checkBirthDay() && checkEmail() && checkAddress() && checkRentDays() && checkAttach()&&checkDiscount())
    if (isAddCustomer) {
        listCustommer[index].id = document.getElementById('id').value
        listCustommer[index].name = document.getElementById('name').value;
        listCustommer[index].birthDay = document.getElementById('birthday').value;
        listCustommer[index].email = document.getElementById('email').value;
        listCustommer[index].address = document.getElementById('address').value;

        var customerstemp = document.getElementById('customers');
        listCustommer[index].customers = customerstemp.options[customerstemp.selectedIndex].text;

        listCustommer[index].discount = document.getElementById('discount').value;
        listCustommer[index].attach = document.getElementById('attach').value;
        listCustommer[index].rentDays = document.getElementById('rentdays').value;

        var servicestemp = document.getElementById('services');
        listCustommer[index].services = servicestemp.options[servicestemp.selectedIndex].text;

        var roomstemp = document.getElementById('rooms');
        listCustommer[index].rooms = roomstemp.options[roomstemp.selectedIndex].text;


        document.getElementById('id').value = ''
        document.getElementById('name').value = '';
        document.getElementById('birthday').value = ''
        document.getElementById('email').value = ''
        document.getElementById('address').value = ''
        document.getElementById('discount').value = '';
        document.getElementById('attach').value = '';
        document.getElementById('rentdays').value = '';
        document.getElementById('index').innerHTML = ''
        displayCustommer();
    }
}

function cancel() {
    document.getElementById('id').value = ''
    document.getElementById('name').value = '';
    document.getElementById('birthday').value = ''
    document.getElementById('email').value = ''
    document.getElementById('address').value = ''
    document.getElementById('discount').value = ''
    document.getElementById('attach').value = ''
    document.getElementById('rentdays').value = ''
    document.getElementById('index').innerHTML = ''

}

function viewInfor(index) {
    var servicesPrice;
    var rentsDay = listCustommer[index].rentDays;
    var discount = 1 - (listCustommer[index].getDiscount() / 100)
    var total;
    if (listCustommer[index].services === 'Villa') {
        servicesPrice = 500;
    } else if (listCustommer[index].services === 'House') {
        servicesPrice = 300;
    } else if (listCustommer[index].services === 'Room') {
        servicesPrice = 100;
    }

    total = servicesPrice * rentsDay * discount;
    alert('Số tiền khách hàng ' + listCustommer[index].getName() + ' cần thanh toán là: ' + total + ' USD');

}

displayCustommer()

function checkFullName() {
    var inputFullName = document.getElementById('name').value
    if (inputFullName.trim().length === 0) {
        document.getElementById('errorname').innerHTML = "Vui lòng nhập Họ và tên"
        return false
    } else {
        document.getElementById('errorname').innerHTML = ""
        return true;
    }
}

function autoCorrectName() {
    var fullName = document.getElementById('name').value
    if (fullName.length === 0) {

    } else {
        inputFullName = fullName.toLowerCase().trim();

        myString = inputFullName[0].toUpperCase();
        for (i = 1; i < inputFullName.length; i++) {
            if (inputFullName[i - 1] === ' ') {
                myString += ' ' + inputFullName[i].toUpperCase()
            } else {
                myString += inputFullName[i]
            }
        }

        //Bieu thuc chinh quy, chua hoc
        myString = myString.replace(/\s+/g, ' ')
        document.getElementById('name').value = myString
    }
}

function checkCMND() {
    var inputcmnd = document.getElementById('id').value;
    if (isNaN(inputcmnd)) {
        document.getElementById('errorid').innerHTML = 'Vui lòng nhập lại CMND'
        return false
    } else if (inputcmnd.length == 0) {
        document.getElementById('errorid').innerHTML = 'Vui lòng nhập CMND'
        return false
    } else if ((inputcmnd < 100000000) || (inputcmnd > 999999999)) {
        document.getElementById('errorid').innerHTML = 'Xem lại số CMND'
        return false
    } else {
        document.getElementById('errorid').innerHTML = "";
        return true
    }
}

function checkBirthDay() {

    var birthDay = document.getElementById('birthday').value;
    if (birthDay.trim().length === 0) {
        document.getElementById('errorbirthday').innerHTML = "Vui lòng nhập ngày sinh"
        return false
    } else if (birthDay.trim().length !== 10) {
        document.getElementById('errorbirthday').innerHTML = "Sai định dàng ngày"
        return false
    } else if ((birthDay[2] !== '/') || (birthDay[5] !== '/')) {
        document.getElementById('errorbirthday').innerHTML = "Sai định dàng ngày"
        return false
    } else {
        if (birthDay.substring(0, 2) > 31) {
            document.getElementById('errorbirthday').innerHTML = "Ngày quá lớn"
            return false
        } else if (birthDay.substring(3, 5) > 12) {
            document.getElementById('errorbirthday').innerHTML = "Tháng quá lớn"
            return false
        } else if ((birthDay.substring(6, 11) > 2020) || (birthDay.substring(6, 11) < 1920)) {
            document.getElementById('errorbirthday').innerHTML = "Năm không đúng"
            return false
        } else {
            document.getElementById('errorbirthday').innerHTML = ""
            return true
        }
    }
}

function checkEmail() {
    var email = document.getElementById('email').value;
    var posa = email.indexOf('@')
    var posdot = email.lastIndexOf('.')
    if (email.length === 0) {
        document.getElementById('erroremail').innerHTML = "Vui lòng nhập email";
        return false
    } else if (posa > posdot) {
        document.getElementById('erroremail').innerHTML = "Vui lòng nhập lại email đúng dịnh dạng";
        return false
    } else
        document.getElementById('erroremail').innerHTML = "";
    return true
}

function checkAddress() {
    var address = document.getElementById('address').value;
    if (address.length == 0) {
        document.getElementById('erroraddress').innerHTML = "Vui lòng nhập địa chỉ";
        return false
    } else {
        document.getElementById('erroraddress').innerHTML = '';
        return true;
    }


}

function autoCorrectAddress() {
    var addresstemp = document.getElementById('address').value
    if (addresstemp.length === 0) {

    } else {
        var address = addresstemp.toLowerCase().trim();
        myString = address[0].toUpperCase();
        for (i = 1; i < address.length; i++) {
            if (address[i - 1] === ' ') {
                myString += ' ' + address[i].toUpperCase()
            } else {
                myString += address[i]
            }
        }
        //Bieu thuc chinh quy, chua hoc
        myString = myString.replace(/\s+/g, ' ')
        document.getElementById('address').value = myString
    }
}

function checkDiscount() {
    var discount = document.getElementById('discount').value;
    if (isNaN(discount)) {
        document.getElementById('errordiscount').innerHTML = 'Vui lòng nhập sô'
        return false
    } else if ((discount < 0) || (discount > 100)) {
        document.getElementById('errordiscount').innerHTML = 'Giá trị discount từ 0-100';
        return false
    } else {
        document.getElementById('errordiscount').innerHTML = '';
        return true
    }

}

function checkAttach() {
    var attach = document.getElementById('attach').value;
    if (isNaN(attach)) {
        document.getElementById('errorattach').innerHTML = 'Vui lòng nhập số';
        return false
    } else if ((attach < 0) || (attach > 4)) {
        document.getElementById('errorattach').innerHTML = 'Số người đi kèm không quá 4';
        return false
    } else {
        document.getElementById('errorattach').innerHTML = '';
        return true
    }
}

function checkRentDays() {
    var rentDays = document.getElementById('rentdays').value;
    if (isNaN(rentDays)) {
        document.getElementById('errorrentdays').innerHTML = 'Vui lòng nhập số';
        return false
    } else if (rentDays.trim().length === 0) {
        document.getElementById('errorrentdays').innerHTML = 'Vui lòng nhâp số ngày thuê'
        return false
    } else if (rentDays < 0) {
        document.getElementById('errorrentdays').innerHTML = 'Số ngày thuê lớn hơn 0'
        return false
    } else {
        document.getElementById('errorrentdays').innerHTML = ''
        return true;
    }
}

document.getElementById('name').addEventListener("blur", checkFullName)
document.getElementById('name').addEventListener("blur", autoCorrectName)
document.getElementById('id').addEventListener("blur", checkCMND)
document.getElementById('birthday').addEventListener("blur", checkBirthDay)
document.getElementById('email').addEventListener("blur", checkEmail)
document.getElementById('address').addEventListener("blur", checkAddress)
document.getElementById('address').addEventListener("blur", autoCorrectAddress)
document.getElementById('discount').addEventListener("blur", checkDiscount)
document.getElementById('attach').addEventListener("blur", checkAttach)
document.getElementById('rentdays').addEventListener("blur", checkRentDays)