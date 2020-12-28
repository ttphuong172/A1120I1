var myProduct=['Sony Eperia','Samsung Galaxy','Nokia 6','Xiaomi Redmi Note 4','Apple iPhone 6S','Xiaomi Mi 5s Plus','Apple iPhone 8 Plus','Fujitsu F-04E','Oppo A71']
var myString='<table>'

for (i=0;i<myProduct.length;i++){
    myString=myString+ '<tr> <td>'+ myProduct[i] +'</td>'+'<td><button>Edit</button></td>'+'<td><button>Delete</button></td>'
}
myString=myString+'</table>'
document.getElementById('displayproduct').innerHTML=myString
console.log(myString)
