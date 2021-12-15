// import {Component, Inject, OnInit} from '@angular/core';
// import {FormControl, FormGroup} from "@angular/forms";
// import {EntityService} from "../../service/entity.service";
// import {IChildEntity} from "../../model/ISanPham";
// import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
// import {IEntity} from "../../model/ILoHang";
//
// @Component({
//   selector: 'app-edit',
//   templateUrl: './edit.component.html',
//   styleUrls: ['./edit.component.css']
// })
// export class EditComponent implements OnInit {
//   laiSuats: string[]=['3 tháng','6 tháng','1 năm'];
//   childEntities:IChildEntity | any;
//
//   entityForm= new FormGroup({
//     id:new FormControl(''),
//     name: new FormControl(''),
//     ngay: new FormControl(''),
//     laiSuat: new FormControl(''),
//     childEntity: new FormControl('')
//   })
//   constructor(
//     private entityService:EntityService,
//     public dialogRefEdit: MatDialogRef<EditComponent>,
//     @Inject(MAT_DIALOG_DATA) public data:IEntity
//   ) { }
//
//   ngOnInit(): void {
//       this.entityService.getAllChildEntity().subscribe(
//         (data)=>{this.childEntities=data},
//         ()=>{},
//         ()=>{
//           this.entityForm.setValue(this.data)
//         }
//       )
//   }
//   compareByID(obj1:any,obj2:any) {
//     return obj1 && obj2 && obj1.id==obj2.id
//   }
//   updateEntity() {
//     this.entityService.updateEntity(this.entityForm.value).subscribe(
//       ()=>{},
//       ()=>{},
//       ()=>{
//         this.dialogRefEdit.close();
//       }
//     )
//   }
//
//   closeDialogEdit() {
//     this.dialogRefEdit.close();
//   }
// }
