import { Component, OnInit } from '@angular/core';
import {ILoHang} from "../../model/lohang";
import {LoHangService} from "../../service/loHang.service";
import {MatDialog} from "@angular/material/dialog";
import {NhaphangComponent} from "../nhaphang/nhaphang.component";
import {DeleteComponent} from "../delete/delete.component";

@Component({
  selector: 'app-sanpham-list',
  templateUrl: './sanpham-list.component.html',
  styleUrls: ['./sanpham-list.component.css']
})
export class SanphamListComponent implements OnInit {
  lohangs:ILoHang | any;
  p: number | any;
  name: any;
  ngayhethan: any;
  tungay: any;
  denngay: any;
  constructor(
    private loHangService:LoHangService,
    public dialog:MatDialog
  ) { }

  ngOnInit(): void {
    this.loHangService.getAllEntity().subscribe(
      (data)=>{this.lohangs=data},
      ()=>{},
      ()=>{}
    )
  }


  openDialogNhapHang() {
    const dialogRefCreate=this.dialog.open(NhaphangComponent,{
          width:'800px'
        })
    dialogRefCreate.afterClosed().subscribe(
      ()=>{},
      ()=>{},
      ()=>{
        this.ngOnInit();
      }
    )
  }

  openDialogDelete(lohang:ILoHang) {
    const dialogRefDelete=this.dialog.open(DeleteComponent,{
      width:'400px',
      data:lohang,
      disableClose:true
    })
    dialogRefDelete.afterClosed().subscribe(
      ()=>{},
      ()=>{},
      ()=>{
        this.ngOnInit();
      }
    )
  }

  timkiem() {
    this.loHangService.searchByName(this.name).subscribe(
      (data)=>{this.lohangs=data}
    )
  }

  timkiemnhh() {
    this.loHangService.searchByNHH(this.ngayhethan).subscribe(
      (data)=>{this.lohangs=data}
    )
  }

  timkiemngaynhap() {

  }
}
