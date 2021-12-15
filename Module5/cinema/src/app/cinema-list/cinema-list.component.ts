import { Component, OnInit } from '@angular/core';
import {CinemaService} from "../service/cinema.service";
import {ICinema} from "../model/ICinema";
import {MatDialog} from "@angular/material/dialog";
import {CinemaDeleteComponent} from "../cinema-delete/cinema-delete.component";
import {CinemaCreateComponent} from "../cinema-create/cinema-create.component";

@Component({
  selector: 'app-cinema-list',
  templateUrl: './cinema-list.component.html',
  styleUrls: ['./cinema-list.component.css']
})
export class CinemaListComponent implements OnInit {
  cinemas:ICinema | any;

  constructor(
    private cinemaService:CinemaService,
    private dialog:MatDialog
  ) { }

  ngOnInit(): void {
    this.cinemaService.getAllCinema().subscribe(
      (data)=>{this.cinemas= data}
    )
  }

  openDialogDelete(cinema:ICinema) {
    const dialogDeleteRef = this.dialog.open(CinemaDeleteComponent, {
      width: '250px',
      data: cinema,
    });
    dialogDeleteRef.afterClosed().subscribe(
      ()=>{},
      ()=>{},
      ()=>{
      this.ngOnInit();
      }
    )
  }

}
