var firstArray=[]
for (let i=0;i<10;i++){
    firstArray[i]=Math.round(Math.random()*10)
}
document.getElementById('firstarray').innerHTML=firstArray

function checkArray(arr,number) {
    var count=0;
    for (let i=0;i<arr.length;i++){
        if (number==arr[i]){
            count+=1;
        }
    }
    if (count>0){
        return count
    } else
        return -1
}

function display() {
    var number=document.getElementById('number').value;
    console.log(number)
    console.log(firstArray)
    var result=checkArray(firstArray,number)
    document.getElementById('result').innerHTML=result;
}