class myDate {
    constructor(day,month,year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    getDay(){
        return this.day;
    }
    getMonth(){
        return this.month;
    }
    getYear(){
        return this.year
    }
    setDay(day){
        this.day=day;
    }
    setMonth(month){
        this.month=month;
    }
    setYear(year){
        this.year=year;
    }
    setDate(day,month,year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    toString(){
        return this.day+'/'+this.month+'/'+this.year;
    }
}

var dayHaNoi=new myDate(15,12,2020);
console.log(dayHaNoi.getDay())
dayHaNoi.setDay(20)
console.log(dayHaNoi.getDay())


dayHaNoi.setDate(6,1,2020)

console.log(dayHaNoi.toString())
