import {IStudent} from "../model/student";

export const studentDAO: IStudent[] = [
  {
    id:1,
    name: "Tran Thanh Phuong",
    age: 25,
    mark: 3,
    phones: [123,123],
    address:
      {
        street: "43 Cam Nam 7",
        city: "Da Nang",
        state: "Da Nang",
        zip: 55000
      }
  }
]
