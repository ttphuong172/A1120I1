var arr=[]
for (i=0;i<10;i++){
    arr[i]=Math.round(Math.random()*100)
}
document.getElementById('array').innerHTML=arr;
var result=arr.sort(function (a,b) {
return b-a;
})
document.getElementById('result').innerHTML=result