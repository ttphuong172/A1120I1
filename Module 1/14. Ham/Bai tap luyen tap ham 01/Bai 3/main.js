function check() {
var number1=document.getElementById('number1').value;
var number2=document.getElementById('number2').value;
console.log(checkInputNumber(number1))
if ((checkInputNumber(number1)) && (checkInputNumber(number2))) {
    document.getElementById('errornumber').innerHTML =''
    var result=checkTwoPara(number1,number2);
} else{
    document.getElementById('errornumber').innerHTML ='Kiem tra lai du lieu nhap vao'
}

document.getElementById('result').innerHTML=result
}

function checkTwoPara(number1,number2) {
    if (number1>number2){
        return 'So thu nhat lon hon so thu 2'
    } else {
        return parseInt(number1)+parseInt(number2);
    }
}
function checkInputNumber(number) {
    if ( isNaN(number)){
        return false

    } else{
        return true
    }


}