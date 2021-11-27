import { Component, OnInit } from '@angular/core';
import { studentDAO } from '../studentdao/studentDao';
import {IStudent} from "../model/student";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students=studentDAO;
  selectedStudent?:IStudent

  constructor() { }

  ngOnInit(): void {
  }
  selectStudent(student:IStudent){
    this.selectedStudent=student;
    console.log(this.selectedStudent)
  }


}
