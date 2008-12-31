alert()

var btnDisplayElement = document.getElementById('btndisplay');

function init(){
    btnDisplayElement.style.position='relative';
    btnDisplayElement.style.top='100px';
    btnDisplayElement.style.left='100px';
}
function moverandom(){
    btnDisplayElement.style.top=Math.round(Math.random()*600)+'px';
    btnDisplayElement.style.left=Math.round(Math.random()*800)+'px';

    console.log('cao',btnDisplayElement.style.top);
    console.log('rong', btnDisplayElement.style.left);
}