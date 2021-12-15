// import {Component, Inject, OnInit} from '@angular/core';
// import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
// import {IEntity} from "../../model/ILoHang";
// import {EntityService} from "../../service/entity.service";
//
// @Component({
//   selector: 'app-delete',
//   templateUrl: './delete.component.html',
//   styleUrls: ['./delete.component.css']
// })
// export class DeleteComponent implements OnInit {
//
//   constructor(
//     private entityService:EntityService,
//     public dialogRefDelete: MatDialogRef<DeleteComponent>,
//     @Inject(MAT_DIALOG_DATA) public data:IEntity
//   ) { }
//
//   ngOnInit(): void {
//   }
//
//   deleteEntity(entity:IEntity) {
//     this.entityService.deleteEntity(entity).subscribe(
//       ()=>{},
//       ()=>{},
//       ()=>{
//         this.dialogRefDelete.close();
//       }
//     )
//   }
//
//
//   closeDialogDelete() {
//     this.dialogRefDelete.close()
//   }
// }
