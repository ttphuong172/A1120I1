class Student {
    private _name:string;
    private _age: number;
    
    constructor(_name:string,_age:number) {
        this._name=_name
        this._age=_age;
    }
    
    public get name() : string {
        return this._name
    }
    
    public set name(v : string) {
        this._name = v;
    }

    public get age(): number {
        return this._age;
    }
    public set age(value: number) {
        this._age = value;
    }
    
    
}
let student=new Student("Phuong",37);
student.name="Chau";
student.age=37;
console.log(student.name);
console.log(student.age);