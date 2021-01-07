class Temperature{
    constructor(doC) {
        if (doC<-273){
            doC=-273;
        }
        this.doC=doC
    }
    ctoF(){
        return (this.doC*9)/5+32
    }
    ctoKenvin(){
        return this.doC+273.15
    }
}

var nhietDoNewYork=new Temperature(20);
console.log(nhietDoNewYork.ctoF());
console.log(nhietDoNewYork.ctoKenvin());