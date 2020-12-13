function doanSo(){
    var guessNumber=parseInt(prompt('Nhap so 0-10'));
    var autoNumber=Math.round(Math.random()*10);
    if (guessNumber==autoNumber){
        alert('WIN');
    } else {
        alert('LOSE');
    }
}