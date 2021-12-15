export interface IStudent{
    id:number;
    name:string;
    age:number;
    mark:number;
    phones:number[];
    address: {
      street:string;
      city:string;
      state:string;
      zip:number;
    }
}
