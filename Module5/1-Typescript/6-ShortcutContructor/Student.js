"use strict";
var Student = /** @class */ (function () {
    function Student(_name, _age) {
        this._name = _name;
        this._age = _age;
    }
    Object.defineProperty(Student.prototype, "name", {
        get: function () {
            return this._name;
        },
        set: function (value) {
            this._name = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "age", {
        get: function () {
            return this._age;
        },
        set: function (value) {
            this._age = value;
        },
        enumerable: false,
        configurable: true
    });
    return Student;
}());
var student = new Student("Phuong", 37);
console.log(student.name);
console.log(student.age);
