/**
 * Created by admin on 12/9/2020.
 */
function findday(){
    var month=document.getElementById('month').value;
    var result=document.getElementById('result').value;
    switch (month){
        case '1':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 31 ngay');
            break;
        case '2':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 28,29 ngay');
            break;
        case '3':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '3':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '4':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '5':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '6':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '7':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '8':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '9':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '10':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '11':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        case '11':
            document.getElementById('result').innerHTML=('Thang '+ month+' co 30 ngay');
            break;
        default :
            document.getElementById('result').innerHTML=('Khong co thang '+ month+' nha may cha noi');
            break;
    }

}