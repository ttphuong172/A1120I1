import { Component, OnInit } from '@angular/core';
import {FormArray, FormControl, FormGroup, Validators} from "@angular/forms";
import {studentDAO} from "../studentdao/studentDao";

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {


  studentForm!:FormGroup;


  constructor() { }

  ngOnInit(): void {
    this.studentForm = new FormGroup({
      name:new FormControl('',[Validators.required]),
      age:new FormControl('',[Validators.required,Validators.min(18)]),
      mark: new FormControl('',[Validators.required,Validators.min(0),Validators.max(10)]),
      phones: new FormArray([]),
      address:new FormGroup(
        {
          street: new FormControl(''),
          city: new FormControl(''),
          state: new FormControl(''),
          zip:new FormControl('')
        }
      )
    })
  }


  onSubmit(){
    studentDAO.push(this.studentForm.value);
  }
  get name (){
    return this.studentForm.get('name')!;
  }
  get age (){
    return this.studentForm.get('age')!;
  }
  get mark (){
    return this.studentForm.get('mark')!;
  }

  get phones(){
    return this.studentForm.get('phones') as FormArray;
  }

  addPhone (){
   this.phones.push(new FormControl(''))

  }

}

