import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {ICinema} from "../model/ICinema";
import {HttpClient} from "@angular/common/http";
import {IFilm} from "../model/IFilm";

@Injectable({
  providedIn: 'root'
})
export class CinemaService {

  constructor(
    private httpClient:HttpClient
  ) { }
  getAllCinema():Observable<ICinema[]>{
    return this.httpClient.get<ICinema[]>('http://localhost:3000/cinemas')
  }
  deleteCinema(id:string){
    return this.httpClient.delete('http://localhost:3000/cinemas/'+ id)
  }
  getAllFilm():Observable<IFilm[]>{
    return this.httpClient.get<IFilm[]>('http://localhost:3000/films')
  }
  saveCinema(cinema:ICinema):Observable<ICinema>{
    return this.httpClient.post<ICinema>('http://localhost:3000/cinemas',cinema)
  }
}
