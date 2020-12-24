var string='    boi tinh  n  nnn  nnn    v voi buy     '
var myString=string.trim().replace(/\s+/g, ' ')
var count=0
for (i=0;i<myString.length;i++){
    if (myString[i]==' '){
        count+=1;
    }
}
if (myString.length===0){
    count=0;
} else{
    if (count===0){
        count=1
    } else
        count+=1;
}

document.getElementById('string').innerHTML= '<pre>'+'"'+string+'"'+'</pre>';
document.getElementById('result').innerHTML=count;