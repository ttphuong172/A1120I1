var a=[ 'c', 's', 'c', '2', '6', '1' ] ;
myString='';
for (i=a.length-1;i>=0;i--){
    myString+=a[i];
}
console.log(myString)
document.getElementById('array').innerHTML=a;
document.getElementById('result').innerHTML=myString;
