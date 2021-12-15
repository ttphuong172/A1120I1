import { Injectable } from '@angular/core';
export interface IStudent{
  id:number,
  name:string
}

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  students:IStudent[]=[
    {
      id:1,
      name:"Tran Thanh Phuong"
    },
    {
      id:2,
      name:"Vo Trung Trong"
    }
  ]
  constructor() { }

  deleteStudent(){
    console.log(this.students.pop())
    console.log(this.students)
  }
}
