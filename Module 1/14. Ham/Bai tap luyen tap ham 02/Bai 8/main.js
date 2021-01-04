var firstArray=[];
for(let i=0;i<10;i++){
    firstArray[i]=Math.round(Math.random()*100);
}
console.log(firstArray)
document.getElementById('firstarray').innerHTML=firstArray
function reverseArray(){
    var secondArray=[]
    for (let i=0;i<firstArray.length;i++){
        secondArray[i]=firstArray[firstArray.length-1-i]
    }
    return secondArray
}
document.getElementById('result').innerHTML=reverseArray(firstArray)
console.log(reverseArray(firstArray))