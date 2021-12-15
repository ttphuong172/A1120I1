import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {PhoneService} from "../service/phone.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  formPhone=new FormGroup({
    producer:new FormControl(''),
    model:new FormControl(''),
    price:new FormControl('')
  })
  constructor(
    private phoneService:PhoneService,
    public router: Router
  ) { }

  ngOnInit(): void {
  }


  savePhone() {
    this.phoneService.savePhone(this.formPhone.value).subscribe(
      ()=>{this.router.navigateByUrl("")}
    )
  }
}
