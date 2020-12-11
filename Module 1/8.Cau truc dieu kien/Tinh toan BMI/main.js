/**
 * Created by admin on 12/9/2020.
 */
var weigthElement=document.getElementById('weigth');
var heigthElement=document.getElementById('heigth');
var resultElement=document.getElementById('result');
function bmi(){
    var bmi=parseFloat(weigthElement.value)/(parseFloat(heigthElement.value) *2);
    console.log(bmi);
    if (bmi<18.5){
        resultElement.innerHTML="Underweigth";
    }
    else if (bmi<25){
        resultElement.innerHTML="Normal";
    }
    else if (bmi<30){
        resultElement.innerHTML="Overweigth";
    }
    else{
        resultElement.innerHTML="Obese";
    }
}