/**
 * Created by admin on 12/11/2020.
 */
function checkMod(){
    var firstNumber=document.getElementById('firstnumber').value;
    var secondNumber=document.getElementById('secondnumber').value;

    var result = parseInt(firstNumber)%parseInt(secondNumber);
    if (result==0){
        document.getElementById('result').innerHTML=('Key qua: '+firstNumber+'&nbsp;'+'chia het cho'+'&nbsp;'+ secondNumber);
    }
    else{
        document.getElementById('result').innerHTML=('Key qua: '+firstNumber+'&nbsp;'+'KHONG chia het cho'+'&nbsp;'+ secondNumber);
    }

}