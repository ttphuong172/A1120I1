import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { EmployeeListComponent } from './employee/employee-list/employee-list.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';


@NgModule({
  declarations: [
    AppComponent,
    CustomerListComponent,
    EmployeeListComponent,
    CustomerCreateComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
