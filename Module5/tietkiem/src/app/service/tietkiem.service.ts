import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ITietKiem} from "../model/tietkiem";
import {IKhachHang} from "../model/khachhang";
import {Observable} from "rxjs";
import {IKyHan} from "../model/kyhan";

@Injectable({
  providedIn: 'root'
})
export class TietkiemService {

  constructor(private httpClient: HttpClient) {
  }


  getAllTietKiem(): Observable<ITietKiem[]> {
    return this.httpClient.get<ITietKiem[]>('http://localhost:3000/tietkiems')
  }
  deleteTietKiem(id:any):Observable<ITietKiem>{
    return this.httpClient.delete<ITietKiem>('http://localhost:3000/tietkiems/' + id)
  }
  getAllTKhachHang(): Observable<IKhachHang[]> {
    return this.httpClient.get<IKhachHang[]>('http://localhost:3000/khachhangs')
  }
  getAllTKyHan(): Observable<IKyHan[]> {
    return this.httpClient.get<IKyHan[]>('http://localhost:3000/kyhans')
  }
  saveTietKiem(tietkiem:ITietKiem):Observable<ITietKiem>{
    return this.httpClient.post<ITietKiem>('http://localhost:3000/tietkiems',tietkiem)
  }
  updateTietKiem(tietkiem:ITietKiem):Observable<ITietKiem>{
    return this.httpClient.put<ITietKiem>('http://localhost:3000/tietkiems/'+ tietkiem.id,tietkiem)
  }
}
