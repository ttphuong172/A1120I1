import {Component, OnInit} from '@angular/core';
import {ITietKiem} from "../../model/tietkiem";
import {TietKiemService} from "../../service/tietKiem.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {IKyHan} from "../../model/kyhan";

@Component({
  selector: 'app-tietkiem-edit',
  templateUrl: './tietkiem-edit.component.html',
  styleUrls: ['./tietkiem-edit.component.css']
})
export class TietkiemEditComponent implements OnInit {

  tietKiem: ITietKiem | any;
  kyhans: IKyHan | any;


  tietKiemForm: FormGroup = new FormGroup({
    id: new FormControl('', [Validators.required]),
    khachHang: new FormGroup({
      id: new FormControl('', [Validators.required]),
      ten: new FormControl('', [Validators.required, Validators.pattern('^[a-z A-Z]+$')])
    }),
    ngayMoSo: new FormControl('', [Validators.required]),
    ngayBatDau: new FormControl('', [Validators.required]),
    kyHan: new FormControl('', [Validators.required]),
    soTien: new FormControl('', [Validators.required]),
    laiSuat: new FormControl('', [Validators.required]),
    uuDai: new FormControl('', [Validators.required])
  })
  constructor(
    private tietKiemService: TietKiemService,
    private route: ActivatedRoute,
    private router: Router
  ) {
  }
  ngOnInit(): void {
    const routeParams = this.route.snapshot.paramMap;
    const idFromRoute = Number(routeParams.get('id'));

    this.tietKiemService.getAllKyHan().subscribe(
      (data) => {
        this.kyhans = data
      },
      () => {
      },
      () => {
        this.tietKiemService.findTietKiemById(idFromRoute).subscribe(
          (data) => this.tietKiem = data,
          () => {
          },
          () => {
            this.tietKiemForm.setValue(this.tietKiem);
          }
        )
      }
    )
  }
  submitUpdateTietKiem() {
    this.tietKiemService.updateTietKiem(this.tietKiemForm.value).subscribe(
      () => {
      },
      () => {
      },
      () => {
        this.router.navigateByUrl('/tietkiem');
      }
    )
  }
  get ten() {
    return this.tietKiemForm.get('khachHang.ten')!;
  }

}
