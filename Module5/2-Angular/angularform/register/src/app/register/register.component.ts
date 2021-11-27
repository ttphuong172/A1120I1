import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() {
  }

  registerForm!: FormGroup

  ngOnInit(): void {
    this.registerForm = new FormGroup({
      email: new FormControl('',[Validators.required,Validators.email]),
      pwGroup: new FormGroup(
        {
          password: new FormControl(''),
          comfirmPassword: new FormControl('')
        }
      ),
      country: new FormControl(''),
      age: new FormControl('',[Validators.required,Validators.min(18)]),
      gender: new FormControl(''),
      phone: new FormControl('',[Validators.required,Validators.pattern(/^\+84\d{9,10}$/)])
    })
  }

  onSubmit() {
    console.log(this.registerForm.value)
  }
  get email(){
    return this.registerForm.get('email')!;
  }
  get phone(){
    return this.registerForm.get('phone')!;
  }
  get age(){
    return this.registerForm.get('age');
  }

}
