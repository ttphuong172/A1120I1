/**
 * Created by admin on 12/12/2020.
 */
function fiboMod(){
    var firstNumber=1;
    var secondNumber=1;
    nextNumber=2;
    var mod=parseInt(document.getElementById('mod').value);
    while (nextNumber%mod){
        //Dung thi thuc hien vong lap: gia tri khac 0 se la dung
        var nextNumber=firstNumber+secondNumber;
        firstNumber=secondNumber;
        secondNumber=nextNumber;
    }
        //Gia tri bang 0 thi se sai va thuc hien lenh ben duoi
    document.getElementById('result').innerHTML=nextNumber;
}