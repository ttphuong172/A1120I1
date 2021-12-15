import {Component, OnInit} from '@angular/core';
import {ITietKiem} from "../model/tietkiem";
import {TietkiemService} from "../service/tietkiem.service";
import {MatDialog} from "@angular/material/dialog";
import {TietkiemDetailComponent} from "../tietkiem-detail/tietkiem-detail.component";
import {TietkiemDeleteComponent} from "../tietkiem-delete/tietkiem-delete.component";
import {TietkiemCreateComponent} from "../tietkiem-create/tietkiem-create.component";
import {TietkiemEditComponent} from "../tietkiem-edit/tietkiem-edit.component";
import {MatSnackBar} from "@angular/material/snack-bar";



@Component({
  selector: 'app-tietkiem-list',
  templateUrl: './tietkiem-list.component.html',
  styleUrls: ['./tietkiem-list.component.css']
})
export class TietkiemListComponent implements OnInit {

  tietkiems: ITietKiem[] | any;

  constructor(
    private tietKiemService: TietkiemService,
    private dialog: MatDialog,
    private snackBar: MatSnackBar
  ) {
  }

  ngOnInit(): void {
    this.tietKiemService.getAllTietKiem().subscribe(
      (data) => {
        this.tietkiems = data;
      }
    )
  }

  displayedColumns: string[] = ['id', 'idkh', 'ten', 'ngaymoso', 'ngaybatdau', 'kyhan', 'sotien', 'laisuat', 'uudai', 'actions'];

  openDialogDetail(element: any) {
    const dialogDetail = this.dialog.open(TietkiemDetailComponent, {
        width: '400px',
        data: element
      }
    )
  }

  openDialogDelete(element: any) {
    const dialogDelete = this.dialog.open(TietkiemDeleteComponent, {
        width: '400px',
        data: element
      }
    )
    dialogDelete.afterClosed().subscribe(
      (check) => {
        if (check){
          this.tietKiemService.deleteTietKiem(element.id).subscribe(
            () => {
              this.snackBar.open("Da xoa thanh cong:"+ element.khachHang.ten,'',{
                duration:5000
              })
            },
            () => {
            },
            () => {

              this.ngOnInit();
            }
          )
        }
      }
    )
  }

  openDialogCreate() {
     const dialogCreate = this.dialog.open(TietkiemCreateComponent, {
        width: '900px'
      }
    );
    dialogCreate.afterClosed().subscribe(
      () => {
      },
      () => {
      },
      () => {
        this.ngOnInit();
      }
    )
  }
  openDialogEdit(element:any){
    const dialogEdit=this.dialog.open(TietkiemEditComponent,{
      width:'900px',
      data:element
    })
    dialogEdit.afterClosed().subscribe(
      ()=>{},
      ()=>{},
      ()=>{
        this.ngOnInit();
      }
    )

  }
}
