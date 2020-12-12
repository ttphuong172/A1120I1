/**
 * Created by admin on 12/12/2020.
 */
function fiboMod(){
    var firstNumber=1;
    var secondNumber=1;
    nextNumber=2;
    var mod=parseInt(document.getElementById('mod').value);
    while (nextNumber%mod){
        var nextNumber=firstNumber+secondNumber;
        firstNumber=secondNumber;
        secondNumber=nextNumber;
    }
    document.getElementById('result').innerHTML=nextNumber;
}