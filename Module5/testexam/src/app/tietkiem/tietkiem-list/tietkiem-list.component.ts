import {Component, OnInit} from '@angular/core';
import {ITietKiem} from "../../model/tietkiem";
import {TietKiemService} from "../../service/tietKiem.service";
import {FormGroup} from "@angular/forms";

@Component({
  selector: 'app-tietkiem-list',
  templateUrl: './tietkiem-list.component.html',
  styleUrls: ['./tietkiem-list.component.css']
})
export class TietkiemListComponent implements OnInit {

  tietKiems: ITietKiem | any;
  id = '';
  name = '';
  p: string | number | any;

  constructor(private tietKiemService: TietKiemService) {
  }

  ngOnInit(): void {
    this.tietKiemService.getAllTietKiem().subscribe(
      (data) => this.tietKiems = data,
      () => {
      },
      () => {
      }
    )
  }

  searchTietKiem() {
    this.p = 1;
    console.log(this.id)
    console.log(this.name)
    if (this.id != '' && this.name == '') {
      console.log('id')
      this.tietKiemService.searchTietKiemById(this.id).subscribe(
        (data) => {
          this.tietKiems = data
        },
        () => {
        },
        () => {
        }
      )
    } else if (this.id == '' && this.name != '') {
      console.log('name')
      this.tietKiemService.searchTietKiemByName(this.name).subscribe(
        (data) => {
          this.tietKiems = data
        },
        () => {
        },
        () => {
        }
      )
    } else if (this.id == '' && this.name == '') {
      console.log('ABC')
      this.tietKiemService.getAllTietKiem().subscribe(
        (data) => this.tietKiems = data
      )
    }

  }
}
