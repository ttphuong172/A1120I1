import { Component } from '@angular/core';
import {MatButtonModule} from "@angular/material/button";
import {MatDialog} from "@angular/material/dialog";
import {DialogDeleteComponent} from "./dialog-delete/dialog-delete.component";
import {StudentService} from "./service/student.service";



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  constructor(
    private dialog:MatDialog,
    private studentService:StudentService
  ) {
  }
  title = 'testmaterial1';


  displayedColumns: string[] = ['id', 'name','action'];
  dataSource = this.studentService.students;
  openDialog(){
    this.dialog.open(DialogDeleteComponent,
      {
        width:'300px',
        height:'200px',
        data:this.studentService.students[0]
      }
    );
  }
}
