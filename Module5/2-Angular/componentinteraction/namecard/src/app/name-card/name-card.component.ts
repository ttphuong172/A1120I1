import {Component, Input, OnInit} from '@angular/core';
import {IEmployee} from "../model/employee";

@Component({
  selector: 'app-name-card',
  templateUrl: './name-card.component.html',
  styleUrls: ['./name-card.component.css']
})
export class NameCardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  @Input() employeesChild:IEmployee[]=[];

}
