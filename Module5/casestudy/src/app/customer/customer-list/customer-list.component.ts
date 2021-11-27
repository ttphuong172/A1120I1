import { Component, OnInit } from '@angular/core';

import {customerDao} from "../../dao/customerDao";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customers=customerDao;
  constructor() { }

  ngOnInit(): void {
  }

}
