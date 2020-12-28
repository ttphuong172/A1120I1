function meterToFeet(meterLength) {
    return 3.279*meterLength;
}
function feetToMeter(feetLength) {
    return  0.305*feetLength
}
function convert() {
    var from=document.getElementById('from').value;
    var to=document.getElementById('to').value;
    var length=document.getElementById('length').value
    var result;

if (from==='meter'){
    if (to==='feet'){
    result=meterToFeet(length)+' feet'
    }
} else if(from==='feet'){
    if (to==='meter'){
        result=feetToMeter(length)+'meter'
    }
}
document.getElementById('result').innerHTML=result;
}