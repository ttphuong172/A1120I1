function checkString() {
    stringA=document.getElementById('stringA').value;
    stringB=document.getElementById('stringB').value;
   if (stringA===stringB){
       document.getElementById('result').innerHTML="Giong nhau"
   } else {
       document.getElementById('result').innerHTML="Khac nhau"
   }

}
