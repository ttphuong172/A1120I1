/**
 * Created by admin on 12/11/2020.
 */
function checkNumber(){
    var number=document.getElementById('number').value;

    if (number==0){
        document.getElementById('result').innerHTML=('So nhap vao bang 0');
    }
    else if ((number>0)) {
        document.getElementById('result').innerHTML=('So nhap vao lon hon 0');
    }
    else{
        document.getElementById('result').innerHTML=('So nhap vao nho hon 0');
    }

}