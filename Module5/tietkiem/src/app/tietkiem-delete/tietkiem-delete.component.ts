import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA} from "@angular/material/dialog";
import {ITietKiem} from "../model/tietkiem";

@Component({
  selector: 'app-tietkiem-delete',
  templateUrl: './tietkiem-delete.component.html',
  styleUrls: ['./tietkiem-delete.component.css']
})
export class TietkiemDeleteComponent implements OnInit {

  constructor(
    @Inject(MAT_DIALOG_DATA) public data:ITietKiem
  ) { }

  ngOnInit(): void {
  }

}
