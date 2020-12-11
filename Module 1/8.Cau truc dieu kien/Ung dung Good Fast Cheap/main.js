/**
 * Created by admin on 12/11/2020.
 */
var goodElement = document.getElementById('good');
var cheapElement = document.getElementById('cheap');
var fastElement = document.getElementById('fast');
goodElement.addEventListener("change",checkCheckGood)
cheapElement.addEventListener("change",checkCheckCheap)
fastElement.addEventListener("change",checkCheckFast)
function checkCheckGood(){
    if (goodElement.checked){
        if  ((fastElement.checked) && (cheapElement.checked)){
           var option = Math.round(Math.random());
            if (option==1){
                fastElement.checked=false;
            }
            else  {
                cheapElement.checked=false;
            }
        }
    }
}
function checkCheckCheap(){
if (cheapElement.checked){
    if ((goodElement.checked) && (fastElement.checked)){
        var option = Math.round(Math.random());
        if (option==1){
            fastElement.checked=false;
        }
        else  {
            goodElement.checked=false;
        }
    }
}
}

function checkCheckFast(){
   if (fastElement.checked){
       if ((goodElement.checked)&&(cheapElement.checked)){
           var option = Math.round(Math.random());
           if (option==1){
               cheapElement.checked=false;
           }
           else  {
               goodElement.checked=false;
           }
       }
   }
}
