import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from "../model/student";

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  @Input() student?:IStudent


}
