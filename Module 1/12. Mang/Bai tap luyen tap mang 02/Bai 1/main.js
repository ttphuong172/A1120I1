//Khoi tao mang 2 chieu
// var arr = new Array(3);
// arr[0] = new Array(4);
// arr[1] = new Array(4);
// arr[2] = new Array(4);
// ---> mảng 3x4
var a= new Array(5);
var myString='<table border="1">';
for (i=0;i<5;i++){
    myString+='<tr>'
    a[i]=new Array(5)
    for(j=0;j<5;j++){
        //console.log(i,j)
        a[i][j]=Math.round(Math.random()*100);
        myString+='<td>'+a[i][j]+'</td>'
    }
    myString+='</tr>'
}
myString+='</table>'
document.getElementById('array').innerHTML=myString
    stringElement='';
for (i=0;i<5;i++) {
    stringElement += ('row ' + (parseInt(i)+1) + '<br>')
    for (j = 0; j < 5; j++) {
        stringElement += a[i][j] + '<br>'
    }
}
document.getElementById('result').innerHTML=stringElement;