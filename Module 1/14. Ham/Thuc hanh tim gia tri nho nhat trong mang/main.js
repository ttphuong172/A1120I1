var array=[]
for (i=0;i<10;i++){
    array[i]=Math.round(Math.random()*100)
}
document.getElementById('array').innerHTML=array;


function minArray(arr) {
    min=arr[0];
    for (i=0;i<arr.length;i++){
        if (arr[i]<min){
            min=arr[i];
        }
    }
    return min
}
var result=minArray(array);
document.getElementById('result').innerHTML=result;