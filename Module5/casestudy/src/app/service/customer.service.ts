import { Injectable } from '@angular/core';
import {ICustomer} from "../model/customer";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private httpClient:HttpClient) { }

  getAllCustomer():Observable<any[]>{
    return this.httpClient.get<ICustomer[]>('http://localhost:3000/customers');
  }

  addCustomer(customer:ICustomer):Observable<any> {
    return  this.httpClient.post('http://localhost:3000/customers',customer);
  }


  findCustomerById(id:any):Observable<any>{
    return this.httpClient.get<ICustomer>('http://localhost:3000/customers/'+id);
  }
  updateCustomer(customer:ICustomer):Observable<any>{
    return this.httpClient.put<ICustomer>('http://localhost:3000/customers/'+customer.id,customer);
  }
  deleteCustomer(customerId:any):Observable<any>{
    return  this.httpClient.delete('http://localhost:3000/customers/'+customerId);
  }



}
