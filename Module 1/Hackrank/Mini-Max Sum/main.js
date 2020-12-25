function miniMaxSum(arr) {
    //Tim min
    var min=arr[0];
    for (i=0;i<arr.length;i++){
        if (arr[i]<min){
            min=arr[i]
        }
    }
    //Tim max
    var max=arr[0];
    for (i=0;i<arr.length;i++){
        if (arr[i]>max){
            max=arr[i]
        }
    }
//Tim sum
    var sum=0;
    for (i=0;i<arr.length;i++){
        sum+=arr[i];
    }

    console.log (sum-max,sum-min)
}
miniMaxSum([1,2,3,4,5])