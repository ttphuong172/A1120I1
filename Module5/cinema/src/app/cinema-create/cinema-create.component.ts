import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";
import {CinemaService} from "../service/cinema.service";
import {IFilm} from "../model/IFilm";
import {Router, Routes} from "@angular/router";

@Component({
  selector: 'app-cinema-create',
  templateUrl: './cinema-create.component.html',
  styleUrls: ['./cinema-create.component.css']
})
export class CinemaCreateComponent implements OnInit {
  films:IFilm | any;
  formCinema=new FormGroup({
    idcinema:new FormControl('',Validators.pattern('CI-+[0-9]{4}')),
    film:new FormControl(''),
    date:new FormControl(''),
    tickets:new FormControl('')
  })
  constructor(
    private cinemaService:CinemaService,
    private router:Router
  ) { }

  ngOnInit(): void {
    this.cinemaService.getAllFilm().subscribe(
      (data)=>{this.films=data}
    )
  }

  saveCinema() {
    this.cinemaService.saveCinema(this.formCinema.value).subscribe(
      ()=>{
        this.router.navigateByUrl('');
      }
    )
  }

}
