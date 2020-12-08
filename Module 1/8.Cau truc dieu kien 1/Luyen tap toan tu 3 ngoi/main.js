/**
 * Created by admin on 12/8/2020.
 */
function sum(a,b){
    return a+b
}

function check(){
    var firstNumber=parseInt(document.getElementById('firstnumber').value) ;
    var secondNumber=parseInt(document.getElementById('secondnumber').value) ;
    var result = sum(firstNumber,secondNumber)<4? 'Below': 'Over';
    alert(result);
}
