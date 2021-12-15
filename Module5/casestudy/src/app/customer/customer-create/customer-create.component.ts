import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../service/customer.service";
import {Router} from "@angular/router";


@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  customerForm: FormGroup | any;

  constructor(
    private customerService: CustomerService,
    private router: Router
  ) {
  }
  ngOnInit(): void {

  this.customerForm=new FormGroup({
    name:new FormControl('',[Validators.required,Validators.pattern('^[a-z A-Z]+$')]),
    birthday:new FormControl('',[Validators.required]),
    idCard:new FormControl('',[Validators.required,Validators.pattern('^([0-9]{9}|[0-9]{12})$')]),
    phone:new FormControl('',[Validators.required,Validators.pattern('^(03|05|07|08|09|01[2|6|8|9])+([0-9]{8})$')]),
    email:new FormControl('',Validators.required),
    address:new FormControl('',Validators.required)
  })
  }
  submitAddCustomer() {
    this.customerService.addCustomer(this.customerForm.value).subscribe(
      () => {
      },
      error => {
      },
      () => {
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
