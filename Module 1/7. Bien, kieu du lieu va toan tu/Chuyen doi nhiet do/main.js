function convert() {
    var doC=document.getElementById('doc').value;
    doF=(parseFloat(doC)*9)/5 + 32;
    document.getElementById('dof').innerHTML=doF;

}