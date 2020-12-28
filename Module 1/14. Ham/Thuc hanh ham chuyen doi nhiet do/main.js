function fToC(fTemp) {
    return (fTemp-32)/1.8;
}
function displayResult() {
    var fTemp=document.getElementById('fTemp').value;
    var result=fToC(fTemp);
    document.getElementById('result').innerHTML=result

}