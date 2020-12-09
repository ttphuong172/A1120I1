var imageElement=document.getElementById('myimage')

function init() {
    imageElement.style.position='relative';
    imageElement.style.top ='100px';
    imageElement.style.left='400px'
}

function moveright() {
    imageElement.style.left=parseInt(imageElement.style.left)+10+'px';
}
function moveleft() {
    imageElement.style.left=parseInt(imageElement.style.left)-10+'px';
}
function moveup() {
    imageElement.style.top=parseInt(imageElement.style.top)-10+'px';
}
function movedown() {
    imageElement.style.top=parseInt(imageElement.style.top)+10+'px';
}