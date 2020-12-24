var arr=['v','g','h','12','r','y','6','7','8','f','32','y'];
var count=0
var b=[]
for (i=0;i<arr.length;i++){
    if (!isNaN(arr[i])){
        count+=1
        b.push(arr[i])
    }
}
document.getElementById('array').innerHTML=arr;
document.getElementById('number').innerHTML=b.join();
document.getElementById('result').innerHTML=count;
