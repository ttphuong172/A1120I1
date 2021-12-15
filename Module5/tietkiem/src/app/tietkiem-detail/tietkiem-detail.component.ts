import {Component, Inject, OnInit} from '@angular/core';
import {ITietKiem} from "../model/tietkiem";
import {MAT_DIALOG_DATA} from "@angular/material/dialog";

@Component({
  selector: 'app-tietkiem-detail',
  templateUrl: './tietkiem-detail.component.html',
  styleUrls: ['./tietkiem-detail.component.css']
})
export class TietkiemDetailComponent implements OnInit {

  constructor(@Inject(MAT_DIALOG_DATA) public data: ITietKiem) { }

  ngOnInit(): void {
  }

}
