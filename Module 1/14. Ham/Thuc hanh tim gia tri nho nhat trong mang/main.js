var array=[10,22,9,33,21,50,41,60,80]



function minArray(arr) {
    count=1;
    for (i=0;i<arr.length;i++){
        if (arr[i]<arr[i+1]){
            count++;
        }
    }
    return count
}
var result=minArray(array);
document.getElementById('result').innerHTML=result;