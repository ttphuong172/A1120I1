import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Phone} from "../model/phone";

@Injectable({
  providedIn: 'root'
})
export class PhoneService {

  constructor(
    private httpClient:HttpClient
  ) { }
  getAllPhone():Observable<Phone[]>{
    return  this.httpClient.get<Phone[]>('http://localhost:8080/phones')
  }
  savePhone(phone:Phone):Observable<Phone>{
    return this.httpClient.post<Phone>('http://localhost:8080/phones',phone)
  }
  deletePhone(phone:Phone):Observable<Phone>{
    return this.httpClient.delete<Phone>('http://localhost:8080/phones/'+ phone.id)
  }
  findPhoneById(id:any):Observable<Phone>{
    return this.httpClient.get<Phone>('http://localhost:8080/phones/'+ id)
  }
}
