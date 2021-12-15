import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { ILoHang} from "../model/ILoHang";

@Injectable({
  providedIn: 'root'
})
export class EntityService {

  constructor(
    private httpClient:HttpClient
  ) { }
  getAllEntity():Observable<ILoHang[]>{
  return this.httpClient.get<ILoHang[]>('http://localhost:3000/entities')
  }
  // getAllChildEntity():Observable<IChildEntity[]>{
  //   return this.httpClient.get<IChildEntity[]>('http://localhost:3000/childentities')
  // }
  // saveEntity(entity:IEntity):Observable<IEntity>{
  //   return this.httpClient.post<IEntity>('http://localhost:3000/entities',entity)
  // }
  // deleteEntity(entity:IEntity):Observable<IEntity>{
  //   return this.httpClient.delete<IEntity>('http://localhost:3000/entities/'+ entity.id)
  // }
  // updateEntity(entity:IEntity):Observable<IEntity>{
  //   return this.httpClient.put<IEntity>('http://localhost:3000/entities/'+ entity.id,entity)
  // }
}
