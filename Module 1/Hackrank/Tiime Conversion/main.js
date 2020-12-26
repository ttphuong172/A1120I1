function timeConversion(s){

    var hour=s[0]+s[1];
    var minute=s[3]+s[4];
    var second=s[6]+s[7]
    var buoi=(s[s.length-2])+(s[s.length-1])

    if (buoi==="PM" && hour!='12'){
        hour=parseInt(hour)+12
    } else if ((buoi==='AM') &&(hour=='12')){
        hour='00'
    }
    var myString=hour+':'+minute+':'+second
    return myString
}