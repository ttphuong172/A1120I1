import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {IKhachHang} from "../model/khachhang";
import {TietkiemService} from "../service/tietkiem.service";
import {IKyHan} from "../model/kyhan";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ITietKiem} from "../model/tietkiem";



@Component({
  selector: 'app-tietkiem-create',
  templateUrl: './tietkiem-create.component.html',
  styleUrls: ['./tietkiem-create.component.css']
})
export class TietkiemCreateComponent implements OnInit {
  khachhangs: IKhachHang | any;
  kyhans: IKyHan | any;
  minDay= new Date();

  formTietKiem : FormGroup = new FormGroup({
      khachHang: new FormControl('', [Validators.required]),
      ngayMoSo: new FormControl('', [Validators.required]),
      ngayBatDau: new FormControl('', [Validators.required]),
      kyHan: new FormControl('', [Validators.required]),
      soTien: new FormControl('', [Validators.required, Validators.min(1000000)]),
      laiSuat: new FormControl('', [Validators.required]),
      uuDai: new FormControl('')
    }
  )


  constructor(
    public dialogCreate: MatDialogRef<TietkiemCreateComponent>,
    private tietKiemService: TietkiemService,
    @Inject(MAT_DIALOG_DATA) public data: ITietKiem
  ) {

  }

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

          }
        )
      }
    );

  };



  onSubmit() {
    console.log (this.formTietKiem.get('ngayMoSo')?.value)
    if (this.formTietKiem.valid) {
      this.tietKiemService.saveTietKiem(this.formTietKiem.value).subscribe(
        () => {
        },
        () => {
        },
        () => {
          this.dialogCreate.close();
        }
      )
    }

  }
}
