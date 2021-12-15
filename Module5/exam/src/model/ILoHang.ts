import {ISanPham} from "./ISanPham";

export interface ILoHang{
  idLoHang:string,
  sanPham:ISanPham,
  soLuong:number,
  ngayNhapHang:string,
  ngaysanXuat:string,
  ngayHetHan:string
}
