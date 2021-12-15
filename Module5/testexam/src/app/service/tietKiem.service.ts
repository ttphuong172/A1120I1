import { Injectable } from '@angular/core';
import {ITietKiem} from "../model/tietkiem";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {IKyHan} from "../model/kyhan";

@Injectable({
  providedIn: 'root'
})
export class TietKiemService {

  constructor(private httpClient:HttpClient) { }
  getAllTietKiem():Observable<ITietKiem[]>{
    return this.httpClient.get<ITietKiem[]>('http://localhost:3000/tietkiems')
  }
  getAllKyHan():Observable<IKyHan[]>{
    return this.httpClient.get<IKyHan[]>('http://localhost:3000/kyhans')
  }
  findTietKiemById(id:any):Observable<ITietKiem>{
    return this.httpClient.get<ITietKiem>('http://localhost:3000/tietkiems/'+id)
  }
  updateTietKiem(tietKiem:ITietKiem):Observable<any>{
    return this.httpClient.put('http://localhost:3000/tietkiems/'+ tietKiem.id,tietKiem)
  }
  searchTietKiemById(id:any):Observable<ITietKiem>{
    return this.httpClient.get<ITietKiem>('http://localhost:3000/tietkiems?id='+id)
  }
  searchTietKiemByName(name:any):Observable<ITietKiem>{
    return this.httpClient.get<ITietKiem>('http://localhost:3000/tietkiems?khachHang.ten='+name)
  }

}
