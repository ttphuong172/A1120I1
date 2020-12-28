var myProduct=['Sony Eperia','Samsung Galaxy','Nokia 6','Xiaomi Redmi Note 4','Apple iPhone 6S','Xiaomi Mi 5s Plus','Apple iPhone 8 Plus','Fujitsu F-04E','Oppo A71']

function displayProduct(){
var myString='<table>'
for (i=0;i<myProduct.length;i++){
    myString=myString+ '<tr> <td>'+ myProduct[i] +'</td>'+'<td><button onclick="editProduct('+i+')" >Edit</button></td>'+'<td><button onclick="deleteProduct('+i+')">Delete</button></td>'
}
myString=myString+'</table>';
document.getElementById('displayproduct').innerHTML=myString;
console.log(myString)
}

function addProduct(){
    var newProduct=document.getElementById('newproduct').value;
    myProduct.push(newProduct);
    document.getElementById('newproduct').value='';
    displayProduct()
}

function deleteProduct(index) {
    myProduct.splice(index,1);
    displayProduct()
}
function editProduct(index) {
    alert(index);
    document.getElementById('editproduct').value=myProduct[index];
    document.getElementById('index').innerHTML=index;
}
function updateProduct(){
    var index=document.getElementById('index').innerHTML
    myProduct[index]=document.getElementById('editproduct').value;
    displayProduct();
}