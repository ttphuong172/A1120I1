// import { Component, OnInit } from '@angular/core';
// import {EntityService} from "../../service/entity.service";
// import {ISanPham} from "../../model/ISanPham";
// import {FormControl, FormGroup, Validators} from "@angular/forms";
// import {MatDialogRef} from "@angular/material/dialog";
//
// @Component({
//   selector: 'app-create',
//   templateUrl: './create.component.html',
//   styleUrls: ['./create.component.css']
// })
// export class CreateComponent implements OnInit {
//   childEntities:ISanPham | any;
//   laiSuats: string[]=['3 tháng','6 tháng','1 năm'];
//   entityForm= new FormGroup({
//     name: new FormControl('',Validators.required),
//     laiSuat: new FormControl('',Validators.required),
//     ngay: new FormControl('',Validators.required),
//     childEntity: new FormControl('',Validators.required)
//   })
//   nowDate=new Date().toISOString().slice(0, 10);
//   constructor(
//     private entityService:EntityService,
//     public dialogRefCreate: MatDialogRef<CreateComponent>
//   ) { }
//
//   // ngOnInit(): void {
//   //   this.entityService.getAllChildEntity().subscribe(
//   //     (data)=>{this.childEntities=data}
//   //   )
//   // }
//
//   // saveEntity() {
//   //   if(this.entityForm.valid){
//   //     this.entityService.saveEntity(this.entityForm.value).subscribe(
//   //       ()=>{},
//   //       ()=>{},
//   //       ()=>{
//   //         this.dialogRefCreate.close()
//   //       }
//   //     )
//   //   }
//   //
//   // }
//
//   // closeDialogCreate() {
//   //   this.dialogRefCreate.close();
//   // }
// }
