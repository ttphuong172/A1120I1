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
//Ham in so nguyen  to
// function printPrime(amount){
//     for(i=1;i<=amount;i++){
//         if (isPrime(i)){
//             console.log(isPrime(i))
//             console.log(i)
//         }
//     }
// }
// printPrime(10000)
function printPrime(amount){
    var i=1;
    var dem=0;
    while(dem<amount){
        if(isPrime(i)){
            console.log(i);
            dem=dem+1;
        }
        isPrime(i)
        i=i+1;
    }
}
printPrime(20)


