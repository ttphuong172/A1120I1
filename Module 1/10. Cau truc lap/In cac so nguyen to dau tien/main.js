//Ham kiem tra so nguyen to
function isPrime(songuyen){
    if (songuyen<2){
        return false
    }
    if (songuyen===2){
        return true;
    }
    if (songuyen>2){
        for (var i=2;i<songuyen;i++){
            var result=songuyen%i;
            if (result===0){
                return false;
            }
        }
    }
    return true
}
//Ham in so nguyen  to theo so luong

function printPrime(amount){
    var i=1;
    var count=0;
    var string='';
    while(count<amount){
        if(isPrime(i)){
            string+=i+',';
            //console.log(i);
            document.getElementById('result').innerHTML=string
            count+=1;
        }
        i=i+1;
    }
}
//Dua ra web
function print(){
var amount = document.getElementById('songuyento').value
printPrime(amount);
}



