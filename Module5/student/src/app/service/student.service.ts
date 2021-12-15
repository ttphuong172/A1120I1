import { Injectable } from '@angular/core';
import {studentDAO} from "../studentdao/studentDao";
import {IStudent} from "../model/student";

@Injectable({
  providedIn: 'root'
})

export class StudentService {

  students=studentDAO;

  constructor() { }
  getStudent(){
    return this.students;
  }
  addStudent (student:IStudent){
    this.students.push(student)
  }
  findStudentById(id:number){
    return  this.students.find(student => student.id === id)
  }
}
