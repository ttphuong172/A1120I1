import {Component, Inject, OnInit} from '@angular/core';
import {TietkiemService} from "../service/tietkiem.service";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {ITietKiem} from "../model/tietkiem";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {IKhachHang} from "../model/khachhang";
import {IKyHan} from "../model/kyhan";

@Component({
  selector: 'app-tietkiem-edit',
  templateUrl: './tietkiem-edit.component.html',
  styleUrls: ['./tietkiem-edit.component.css']
})
export class TietkiemEditComponent implements OnInit {
  khachhangs: IKhachHang | any;
  kyhans: IKyHan | any;

  formTietKiem : FormGroup = new FormGroup({
      id: new FormControl('' ),
      khachHang: new FormControl('', [Validators.required]),
      ngayMoSo: new FormControl('', [Validators.required]),
      ngayBatDau: new FormControl('', [Validators.required]),
      kyHan: new FormControl('', [Validators.required]),
      soTien: new FormControl('', [Validators.required, Validators.min(1000000)]),
      laiSuat: new FormControl('', [Validators.required]),
      uuDai: new FormControl('')
    }
  )


  public compareWith(object1: any, object2: any) {
    return object1 && object2 && object1.id === object2.id;
  }


  constructor(
    private tietKiemService: TietkiemService,
    private dialog: MatDialogRef<TietkiemEditComponent>,
    @Inject(MAT_DIALOG_DATA) public data:ITietKiem
  ) { }

  ngOnInit(): void {
    this.tietKiemService.getAllTKhachHang().subscribe(
      (data) => {
        this.khachhangs = data
      },
      () => {
      },
      () => {
        this.tietKiemService.getAllTKyHan().subscribe(
          (data) => {
            this.kyhans = data
          },
          () => {
          },
          () => {
            this.formTietKiem.get('id')?.setValue(this.data.id),
            this.formTietKiem.get('khachHang')?.setValue(this.data.khachHang),
            this.formTietKiem.get('ngayMoSo')?.setValue(this.data.ngayMoSo),
            this.formTietKiem.get('ngayBatDau')?.setValue(this.data.ngayBatDau),
            this.formTietKiem.get('kyHan')?.setValue(this.data.kyHan),
            this.formTietKiem.get('soTien')?.setValue(this.data.soTien),
            this.formTietKiem.get('soTien')?.setValue(this.data.soTien),
            this.formTietKiem.get('laiSuat')?.setValue(this.data.laiSuat),
            this.formTietKiem.get('uuDai')?.setValue(this.data.uuDai)
          }
        )
      }
    );
  }

  onSubmitUpdate() {
      if (this.formTietKiem.valid){
        this.tietKiemService.updateTietKiem(this.formTietKiem.value).subscribe(
          ()=>{},
          ()=>{},
          ()=>{
            this.dialog.close();
          }
        );
      }
  }
}
