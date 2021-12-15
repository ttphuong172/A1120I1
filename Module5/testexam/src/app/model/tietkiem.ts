import {IKhachHang} from "./khachhang";

export interface ITietKiem {
  id:number,
  khachHang:IKhachHang,
  ngayMoSo: string,
  ngayBatDau:string,
  kyHan:number,
  soTien:number,
  laiSuat:number,
  uuDai:string
}
