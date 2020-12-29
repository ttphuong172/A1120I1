var arrNameCustomers=[
    ['Tran Thanh Phuong','0915010414','Ha Noi'],
    ['Truong Bao Giang Chau','0935326684','Tokyo'],
    ['Tran Thanh Lam','0789023567','New York']
]

    function displayCustommer(){
        myString='<table> <tr> <th>Họ và tên</th> <th>CMND</th> <th>Địa chỉ</th> <th></th></tr>'
        for(i=0;i<arrNameCustomers.length;i++){
            myString+='<tr>'
            for(j=0;j<arrNameCustomers[0].length;j++){
                myString+='<td>'+arrNameCustomers[i][j]+'</td>'
                console.log(arrNameCustomers[i][j])
            }
            myString+= ' <td> <button onclick="deleteCustommer('+i+')"> Delete</button> </td>'+'</tr>'
        }
        myString+='</table>'

        console.log(myString)

        document.getElementById('displaycustommer').innerHTML=myString;
        document.getElementById('totalcustommer').innerHTML=arrNameCustomers.length+' khách hàng';
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
         displayCustommer()
     }

     function deleteCustommer(index) {
        var isDelete=confirm('Bạn có muốn xóa khách hàng'+ arrNameCustomers[index]+'?')
         if(isDelete){
         arrNameCustomers.splice(index,1)
         }
         displayCustommer()
     }