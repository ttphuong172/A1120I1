/**
 * Created by admin on 12/11/2020.
 */
function checkMod(){
    var firstNumber=parseInt(document.getElementById('firstnumber').value);
    var secondNumber=parseInt(document.getElementById('secondnumber').value);
    var thirdNumber=parseInt(document.getElementById('thirdnumber').value);
    if ((firstNumber >secondNumber) && (firstNumber>thirdNumber)){
        document.getElementById('result').innerHTML=('So nguyen thu nhat: '+firstNumber+' la so lon nhat');
    }
    else{
        if  (secondNumber>thirdNumber){
            document.getElementById('result').innerHTML=('So nguyen thu 2: '+secondNumber+' la so lon nhat');
        }
        else{
            document.getElementById('result').innerHTML=('So nguyen thu 3: '+thirdNumber+' la so lon nhat');
        }

    }

}