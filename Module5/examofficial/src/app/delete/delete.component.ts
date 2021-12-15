import {Component, Inject, OnInit} from '@angular/core';
import {LoHangService} from "../../service/loHang.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {ILoHang} from "../../model/lohang";

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(
        private loHangService:LoHangService,
        public dialogRefDelete: MatDialogRef<DeleteComponent>,
        @Inject(MAT_DIALOG_DATA) public data:ILoHang
  ) { }

  ngOnInit(): void {

  }



  deleteELoHang(lohang: ILoHang) {
    this.loHangService.deleteLoHang(lohang).subscribe(
      ()=>{},
      ()=>{},
      ()=>{
        this.dialogRefDelete.close();
      }
    )
  }

  closeDialogDelete() {
    this.dialogRefDelete.close();
  }
}
