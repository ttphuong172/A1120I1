var Student = /** @class */ (function () {
    function Student(name, age) {
        this.name = name;
        this.age = age;
    }
    Student.prototype.getName = function () {
        return this.name;
    };
    Student.prototype.setName = function (name) {
        this.name = name;
    };
    Student.prototype.getAge = function () {
        return this.age;
    };
    Student.prototype.setAge = function (age) {
        this.age = age;
    };
    return Student;
}());
var student = new Student("Phuong", 37);
student.setName("Chau");
student.setAge(36);
console.log(student.name);
console.log(student.age);
