import { Component, OnInit } from '@angular/core';
import {ICustomer} from "../../model/customer";
import {CustomerService} from "../../service/customer.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: ICustomer[] | undefined;
  idDelete:any;
  nameDelete:any;
  constructor(
    private customerService:CustomerService
  ) { }

  ngOnInit(): void {
       this.customerService.getAllCustomer().subscribe(
      (data)=>this.customers=data
    );
  }
  prepareDelete(id:any,name:any){
    this.idDelete=id;
    this.nameDelete=name;
  }
  refresh(): void {
    window.location.reload();
  }
  onDelete(id:any){
    this.customerService.deleteCustomer(id).subscribe(
      ()=>{},
      ()=>{},
      ()=>{
        this.refresh();
      }
    )
  }


}
