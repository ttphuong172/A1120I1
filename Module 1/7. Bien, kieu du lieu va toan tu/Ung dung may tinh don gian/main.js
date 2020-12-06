//Han cong
function addition() {
    var firstNumber = document.getElementById('firstnumber').value;
    var secondNumber=document.getElementById('secondnumber').value;
    var total = parseFloat(firstNumber)+parseFloat(secondNumber);
    document.getElementById('answer').innerHTML="Result Addition:"
    document.getElementById('result').innerHTML=total;
    }
function subtraction() {
    var firstNumber = document.getElementById('firstnumber').value;
    var secondNumber=document.getElementById('secondnumber').value;
    var total = parseFloat(firstNumber)-parseFloat(secondNumber);
    document.getElementById('answer').innerHTML="Result Subtraction:"
    document.getElementById('result').innerHTML=total;
}
function multiplication() {
    var firstNumber = document.getElementById('firstnumber').value;
    var secondNumber=document.getElementById('secondnumber').value;
    var total = parseFloat(firstNumber)*parseFloat(secondNumber);
    document.getElementById('answer').innerHTML="Result Multiplication:"
    document.getElementById('result').innerHTML=total;
}

function division() {
    var firstNumber = document.getElementById('firstnumber').value;
    var secondNumber=document.getElementById('secondnumber').value;
    var total = parseFloat(firstNumber)/parseFloat(secondNumber);
    document.getElementById('answer').innerHTML="Result Devision:"
    document.getElementById('result').innerHTML=total;
}