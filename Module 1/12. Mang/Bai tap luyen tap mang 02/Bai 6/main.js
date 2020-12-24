var string='Toi-sinh-ra-giua-long-mien-Trung'
var myArray=[]
var myString='';
for (i=0;i<string.length;i++){
    myArray[i]=string[i]
    if (myArray[i]==='-'){
        myArray[i]='_'
    }
}
document.getElementById('string').innerHTML='"'+string+'"'
document.getElementById('result').innerHTML='"'+myArray.join('')+'"'
