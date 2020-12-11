/**
 * Created by admin on 12/11/2020.
 */
function checkAge(){
    var ageStudent=document.getElementById('age').value;

    if (ageStudent>=15){
        document.getElementById('result').innerHTML=('Du tuoi hoc lop 10');
    }
    else{
        document.getElementById('result').innerHTML=('Khong du tuoi hoc lop 10');
    }

}