import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {StudentService} from "../service/student.service";
import {IStudent} from "../service/student.service";


@Component({
  selector: 'app-dialog-delete',
  templateUrl: './dialog-delete.component.html',
  styleUrls: ['./dialog-delete.component.css']
})
export class DialogDeleteComponent implements OnInit {

  constructor(
    private studentService:StudentService,
    public dialogRef: MatDialogRef<DialogDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: IStudent)
  { }

  ngOnInit(): void {

  }
  huyClick(){
    console.log(this.data)
    this.dialogRef.close();
  }
  deleteStudent(){
    this.studentService.deleteStudent();
    this.dialogRef.close();


    }


}
