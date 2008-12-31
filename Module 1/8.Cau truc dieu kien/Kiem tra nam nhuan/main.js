/**
 * Created by admin on 12/8/2020.
 */

function isleapYear(year){
   var isYearDivisionBy4=year%4===0;
   var isYearDivisionBy100=year%100===0;
   var isYearDivisionBy400=year%400===0;

    if (isYearDivisionBy4){
        if (isYearDivisionBy100) {
            //Thay the cau lenh comment ben duoi
            return isYearDivisionBy400
//            if (isYearDivisionBy400)
//                return true;
//            else
//            return false;
        } else {
            return true
        }
    }
}

 function checkIsLeapYear(){
     var yearElement=document.getElementById('year').value;
     if (isleapYear(yearElement)){
         document.getElementById('result').innerHTML='Nam nhuan'
     } else{
         document.getElementById('result').innerHTML='Nam khong nhuan'
     }

 }