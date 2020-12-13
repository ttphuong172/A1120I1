function display(){
    var sum=0;
    var count=0;
    var i=1
    var soDauTien=document.getElementById('sodautien').value;
    var soChiaHet=document.getElementById('sochiahet').value;
    while (count<soDauTien){
        if(i%soChiaHet==0){
            sum=sum+i;
            count=count+1;
            console.log(i);
        }
        i+=1;
    }
    console.log(sum);
    document.getElementById('result').innerHTML='Ket qua: '+sum;
}
