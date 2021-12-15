import {Component} from '@angular/core';


export interface student {
  id: number ;
  name: string;
}
const students:student[]=[
  {id:1, name:'Phuong'},
  {id:2, name:'Trong'},
  {id:3, name:'Nhu'}
]



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  displayedColumns: string[] = ['id', 'name','delete'];
  dataSource = students;
  onDelete(value:number){
    console.log(value);
  }
}
