import { Component, OnInit } from '@angular/core';
import { studentDAO } from '../studentdao/studentDao';
import {IStudent} from "../model/student";
import {StudentService} from "../service/student.service";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students?:IStudent[];

  constructor(private studentService:StudentService) { }

  ngOnInit(): void {
    this.students=this.studentService.getStudent();
  }





}
