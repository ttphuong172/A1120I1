alert()

var btnDisplayElement = document.getElementById('btndisplay');

function init(){
    btnDisplayElement.style.position='relative';
    btnDisplayElement.style.top='100px';
    btnDisplayElement.style.left='100px';
}
function moverandom(){
    btnDisplayElement.style.top=Math.floor(Math.random()*window.innerHeight)+'px';
    btnDisplayElement.style.left=Math.floor(Math.random()*window.innerWidth)+'px';

    console.log('cao',Math.floor(Math.random()*window.innerHeight));
    console.log('rong',Math.floor(Math.random()*window.innerWidth));
}