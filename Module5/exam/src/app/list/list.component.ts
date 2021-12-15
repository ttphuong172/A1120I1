import { Component, OnInit } from '@angular/core';
import {EntityService} from "../../service/entity.service";
// import {IEntity} from "../../model/ILoHang";
import {MatDialog} from "@angular/material/dialog";
import {ILoHang} from "../../model/ILoHang";
import {ISanPham} from "../../model/ISanPham";
// import {DetailComponent} from "../detail/detail.component";
// import {CreateComponent} from "../create/create.component";
// import {EditComponent} from "../edit/edit.component";
// import {DeleteComponent} from "../delete/delete.component";
// import {IChildEntity} from "../../model/ISanPham";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  lohangs: ILoHang | any;
  sanphams:ISanPham | any;
  p: number | any;
  constructor(
    private entityService:EntityService,
    public dialog:MatDialog
  ) { }

  ngOnInit(): void {
    this.entityService.getAllEntity().subscribe(
      (data)=>{this.lohangs=data}
    )
  }

  // openDialogDetail(entity:ILoHang) {
  //     const dialogRefDetail=this.dialog.open(DetailComponent,{
  //       width:'450px',
  //       data:entity,
  //       disableClose:true
  //     })
  // }

  // openDialogCreate() {
  //   const dialogRefCreate=this.dialog.open(CreateComponent,{
  //     width:'800px',
  //     disableClose:true
  //   })
  //   dialogRefCreate.afterClosed().subscribe(
  //     ()=>{},
  //     ()=>{},
  //     ()=>{
  //       this.ngOnInit();
  //     }
  //   )
  // }

  // openDialogEdit(entity: IEntity) {
  //
  //       const dialogRefEdit=this.dialog.open(EditComponent,{
  //         width:'800px',
  //         data: entity,
  //         disableClose:true
  //     })
  //   dialogRefEdit.afterClosed().subscribe(
  //     ()=>{},
  //     ()=>{},
  //     ()=>{
  //       this.ngOnInit();
  //     }
  //   )
  // }

  // openDialogDelete(entity: IEntity) {
  //   const dialogRefDelete=this.dialog.open(DeleteComponent,{
  //     width:'450px',
  //     data:entity,
  //     disableClose:true
  //   })
  //   dialogRefDelete.afterClosed().subscribe(
  //     ()=>{},
  //     ()=>{},
  //     ()=>{
  //       this.ngOnInit()
  //     }
  //   )
  // }
}
