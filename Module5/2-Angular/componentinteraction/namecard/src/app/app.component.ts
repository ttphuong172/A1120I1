import { Component } from '@angular/core';
import {IEmployee} from "./model/employee";
import {employees} from "./dao/employeeDao";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'namecard';

  employParent:IEmployee[]=employees;

}
