/**
 * Created by admin on 12/8/2020.
 */
function init(){
    var imgElement=document.getElementById('myImage');
    imgElement.style.position='relative';
    imgElement.style.left='0px';
}
function moveRight(){
    var imgElement1=document.getElementById('myImage');
    imgElement1.style.left=parseInt(imgElement1.style.left) + 10 +'px';
}
