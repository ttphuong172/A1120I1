var english=['love','kiss','go','make love']
var vietnamese=['yêu','hôn','đi','làm tình']
var word=document.getElementById('word')
function timKiem(){

   if(english.indexOf(word.value)!==-1){
       document.getElementById('result').innerHTML=vietnamese[english.indexOf(word.value)]

   }



}