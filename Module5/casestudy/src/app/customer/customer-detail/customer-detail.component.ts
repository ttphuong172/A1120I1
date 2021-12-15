import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ICustomer} from "../../model/customer";
import {CustomerService} from "../../service/customer.service";

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.css']
})
export class CustomerDetailComponent implements OnInit {

  customer: ICustomer | any;

  constructor(
    private route:ActivatedRoute,
    private customerService:CustomerService
  ) { }

  ngOnInit(): void {
    const routeParams = this.route.snapshot.paramMap;
    console.log(routeParams)
    const customerIdFromRoute = Number(routeParams.get('id'));
    this.customerService.findCustomerById(customerIdFromRoute).subscribe(
      (data)=>{this.customer=data},
      ()=>{},
      ()=>{
        console.log("Hoan thanh ket noi")
      }
    );
  }

}
