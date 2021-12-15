import { Component, OnInit } from '@angular/core';
import {PhoneService} from "../service/phone.service";
import {Phone} from "../model/phone";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  phones:Phone [] | any;
  constructor(
    private phoneService:PhoneService
  ) { }

  ngOnInit(): void {
    this.phoneService.getAllPhone().subscribe(
      (data)=>{this.phones=data}
    )
  }

  deletePhone(phone: any) {
    this.phoneService.deletePhone(phone).subscribe(
      ()=>{this.ngOnInit()}
    )
  }
}
