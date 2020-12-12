/**
 * Created by admin on 12/12/2020.
 */
//Ham Fibonacci
function fibo(songuyen){
    var firstNumber=1;
    var secondNumber=1;
    if (songuyen<1){
        document.getElementById('result').innerHTML='Khong co day fibo';
    }
    else if (songuyen==1){
        document.getElementById('result').innerHTML=firstNumber;
    }
    else if(songuyen==2){
        document.getElementById('result').innerHTML=(firstNumber +','+ secondNumber);

    }
    else{
        dayso = firstNumber+','+secondNumber;
        var count=2;
        var sum=2;
        while (count<songuyen){
            var nextNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
            count+=1;
            sum+=nextNumber
            dayso=dayso+','+nextNumber;
        }
        document.getElementById('result').innerHTML=dayso;
        document.getElementById('sum').innerHTML=sum;
    }
}

//
function display(){
    var songuyen=document.getElementById('songuyen').value;
    fibo(songuyen);
}
