function createArray(){
    var array =[]
    for (i=0;i<20;i++){
        array[i]=Math.round(Math.random()*100)
    }
    document.getElementById('array').innerHTML=array;

    max=array[0];
    for (j=0;j<20;j++){
        if (array[j]>max){
            max=array[j];
            index=j;
        }
    }
    document.getElementById('result').innerHTML=max +' o vi tri thu '+index;

}
