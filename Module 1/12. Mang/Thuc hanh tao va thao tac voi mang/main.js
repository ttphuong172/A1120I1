var x=0;
var array =Array();
function addElementToArray(){
    array[x]=document.getElementById('inputarray').value;
    //alert(array[x] + x);
    x++;
    document.getElementById('inputarray').value='';
    displayArray()
}
function displayArray(){
    var result="";
    for (i=0;i<array.length;i++){
        result+='Element['+i+']:'+array[i]+'</br>';
    }
    document.getElementById('result').innerHTML=result;
}