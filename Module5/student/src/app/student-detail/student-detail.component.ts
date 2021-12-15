import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from "../model/student";
import { ActivatedRoute } from '@angular/router';
import {StudentService} from "../service/student.service";
import { Location } from '@angular/common';


@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  student?:IStudent;


  constructor(
    private studentSerivice:StudentService,
    private route: ActivatedRoute,
    private location: Location
  ) {

  }

  ngOnInit(): void {
    const routeParams = this.route.snapshot.paramMap;
    const idFromRoute = Number(routeParams.get('id'));
    this.student = this.studentSerivice.findStudentById(idFromRoute) ;
    console.log(this.student)
  }
  goBack(): void {
    this.location.back();
  }



}
