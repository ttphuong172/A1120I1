import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {ICinema} from "../model/ICinema";
import {CinemaService} from "../service/cinema.service";
import {CinemaListComponent} from "../cinema-list/cinema-list.component";

@Component({
  selector: 'app-cinema-delete',
  templateUrl: './cinema-delete.component.html',
  styleUrls: ['./cinema-delete.component.css']
})
export class CinemaDeleteComponent implements OnInit {

  constructor(
    @Inject(MAT_DIALOG_DATA) public data:ICinema,
    private cinemaService:CinemaService,
    private dialog:MatDialogRef<CinemaDeleteComponent>
  ) { }

  ngOnInit(): void {
  }

  deleteCinema(id:any){
    this.cinemaService.deleteCinema(id).subscribe(
      ()=>{},
      ()=>{},
      ()=>{
        this.dialog.close();
      }
    )
  }
}
