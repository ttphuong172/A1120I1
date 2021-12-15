import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {CustomerListComponent} from "./customer/customer-list/customer-list.component";
import {CustomerCreateComponent} from "./customer/customer-create/customer-create.component";
import {CustomerDetailComponent} from "./customer/customer-detail/customer-detail.component";
import {CustomerEditComponent} from "./customer/customer-edit/customer-edit.component";

const routes:Routes=[
  {
    path:'customer',
    component:CustomerListComponent
  },
  {
    path:'customer/create',
    component:CustomerCreateComponent
  },
  {
    path:'customer/detail/:id',
    component:CustomerDetailComponent
  },
  {
    path:'customer/edit/:id',
    component:CustomerEditComponent
  }
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
