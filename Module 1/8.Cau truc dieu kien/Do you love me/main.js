
var btnDisplayElement = document.getElementById('btndisplay');

function init(){
    btnDisplayElement.style.position='relative';
    btnDisplayElement.style.top='0';
    btnDisplayElement.style.left='0';
}
function moverandom(){
    btnDisplayElement.style.top=Math.round(Math.random()*200)+10+'px';
    btnDisplayElement.style.left=Math.round(Math.random()*200)+10+'px';

    console.log('cao',btnDisplayElement.style.top);
    console.log('rong', btnDisplayElement.style.left);
}
function yesSelect() {
    alert('Vui lòng chờ trong vai ngày nữa')

}
function noSelect() {
    alert('Bạn là một nhân viên tuyệt vời')
}