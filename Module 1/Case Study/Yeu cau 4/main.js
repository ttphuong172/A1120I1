var arrNameCustomers=[
    ['Tran Thanh Phuong','0915010414','Ha Noi'],
    ['Truong Bao Giang Chau','0935326684','Tokyo'],
    ['Tran Thanh Lam','0789023567','New York']
]
var arrNameCustomers2=sapXep()

function sapXep(){
    for (i=0;i<arrNameCustomers.length;i++){
        console.log(i)
        console.log(getName(arrNameCustomers[i][0]))
        arrNameCustomers[i][3]=getName(arrNameCustomers[i][0])
    }
    return arrNameCustomers.sort(compareBy(3))
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
         var address=document.getElementById('address').value;
         myArray=[]
         myArray.push(name)
         myArray.push(cmnd);
         myArray.push(address);
         arrNameCustomers.push(myArray)
         sapXep()
         displayCustommer()
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
