import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {CustomerService} from "../../service/customer.service";
import {ICustomer} from "../../model/customer";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  customerForm: FormGroup | any;


  customer:ICustomer | any;

  constructor(
    private route:ActivatedRoute,
    private customerService:CustomerService,
    private router:Router
  ) { }

  ngOnInit(): void {
    const routeParams = this.route.snapshot.paramMap;
    const customerIdFromRoute = Number(routeParams.get('id'));
    this.customerService.findCustomerById(customerIdFromRoute).subscribe(
      (data)=>this.customer=data,
      ()=>{},
      ()=>{
        console.log(this.customer);
        this.customerForm=new FormGroup({
          id:new FormControl(this.customer.id,Validators.required),
          name:new FormControl(this.customer.name,Validators.required),
          birthday:new FormControl(this.customer.birthday,Validators.required),
          idCard:new FormControl(this.customer.idCard,Validators.required),
          phone:new FormControl(this.customer.phone,Validators.required),
          email:new FormControl(this.customer.email,Validators.required),
          address:new FormControl(this.customer.address,Validators.required)
        })
      }
    );

  }
  submitUpdateCustomer(){
      this.customerService.updateCustomer(this.customerForm.value).subscribe(
        ()=>{},
        ()=>{},
        ()=>{
          this.router.navigateByUrl('/customer');
        }
      );
  }
  get name() {
    return this.customerForm.get('name')!;
  }

  get birthday() {
    return this.customerForm.get('birthday')!;
  }

  get idCard() {
    return this.customerForm.get('idCard')!;
  }

  get phone() {
    return this.customerForm.get('phone')!;
  }

  get email() {
    return this.customerForm.get('email')!;
  }

  get address() {
    return this.customerForm.get('address')!;
  }

}
