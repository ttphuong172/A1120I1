/**
 * Created by admin on 12/16/2020.
 */
function calc(){
    var soDien=document.getElementById('index').value;
    var result;
    if (soDien<=50){
        result=soDien*1500;
    } else if (soDien<=100){
        result=50*1500 + (soDien-50)*2000
    } else if (soDien<=150){
        result=50*1500 + 50*2000+ (soDien-100)*3000;
    } else{
        result=50*1500 + 50*2000+ 50*3000+(soDien-150)*4000;
    }
    document.getElementById('result').innerHTML=result;
}



