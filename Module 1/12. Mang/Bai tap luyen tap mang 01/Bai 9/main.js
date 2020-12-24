var a=[]
var b=[]
for (i=0;i<10;i++){
    a[i]=Math.round(Math.random()*100);
    b[i]=Math.round(Math.random()*100);
}
document.getElementById('firstarr').innerHTML=a;
document.getElementById('secondarr').innerHTML=b;
document.getElementById('final').innerHTML=a.concat(b);