import {IKhachHang} from "./khachhang";
import {IKyHan} from "./kyhan";

export interface ITietKiem{
  id:number;
  khachHang:IKhachHang;
  ngayMoSo:string;
  ngayBatDau:string;
  kyHan:IKyHan;
  soTien:number;
  laiSuat:number;
  uuDai:string;
}
