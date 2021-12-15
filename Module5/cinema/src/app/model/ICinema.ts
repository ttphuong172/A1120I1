import {IFilm} from "./IFilm";

export interface ICinema{
  id:number,
  idcinema:string,
  film:IFilm,
  date:string,
  tickets:number
}
