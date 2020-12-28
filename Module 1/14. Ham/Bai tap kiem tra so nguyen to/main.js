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

function check() {
    var result;
    var number=document.getElementById('number').value;
    if(isPrime(number)){
        result='la so nguyen to'
    } else {
        result='khong la so nguyen to'
    }
    document.getElementById('result').innerHTML=result;
}