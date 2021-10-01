class Student {
    name:string;
    age:number;
    constructor(name:string,age:number) {
        this.name=name;
        this.age=age;
    }
    public getName(){
        return this.name
    }
    public setName(name:string):void{
        this.name=name;
    }
    public getAge(){
        return this.age
    }
    public setAge(age:number):void{
        this.age=age
    }
}
let student=new Student("Phuong",37);
student.setName("Chau");
student.setAge(36)
console.log(student.name);
console.log(student.age);