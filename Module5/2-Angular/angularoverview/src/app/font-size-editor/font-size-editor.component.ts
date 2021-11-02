import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-font-size-editor',
  templateUrl: './font-size-editor.component.html',
  styleUrls: ['./font-size-editor.component.css']
})
export class FontSizeEditorComponent implements OnInit {

  public fontSize:number=14;
  constructor() { }

  ngOnInit(): void {
  }

  onChange(e:any){
    this.fontSize=e.target.value;
  }


}
