import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, ParamMap} from "@angular/router";
import {PhoneService} from "../service/phone.service";
import {Phone} from "../model/phone";

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  phone: any;
  
  constructor(
    private activatedRoute:ActivatedRoute,
    private phoneService:PhoneService
  ) { }

  ngOnInit(): void {
    const routeParams = this.activatedRoute.snapshot.paramMap;
    const id = Number(routeParams.get('id'));
    this.phoneService.findPhoneById(id).subscribe(
      (data)=>{
        this.phone=data;
        console.log(this.phone.id);
        console.log(this.phone.price);
        console.log(this.phone.producer);
        console.log(this.phone.price);
      }
    )

  }

}
