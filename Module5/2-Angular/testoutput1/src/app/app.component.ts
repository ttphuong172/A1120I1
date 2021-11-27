import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'testoutput1';
  parentValue="";

  bcd(ed: string){
   console.log(ed)
  }
}
