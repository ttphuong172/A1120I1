function findConstellation(star) {
    starColect=['Polaris','Aldebaran','Deneb','Vega','Altair','Dubhe','Regulus'];
    constCollect=['Ursa Minor', 'Tarurus', 'Cygnus', 'Lyra', 'Aquila', 'Ursa Major','Leo'] ;
    for (i=0;i<starColect.length;i++){
        if (star===starColect[i]){
            alert(constCollect[i])
        }
    }
}

function action(){
    var myString=prompt('Nhap vao ngoi sao can tim')
    findConstellation(myString)
}

