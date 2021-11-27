import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-child-componet',
  templateUrl: './child-componet.component.html',
  styleUrls: ['./child-componet.component.css']
})
export class ChildComponetComponent implements OnInit {

  @Output() newItemEnvent = new EventEmitter<string>();
  @Input() childValue:any;

  abc (value:string){
    this.newItemEnvent.emit(value)
  }
  constructor() { }

  ngOnInit(): void {
  }

}
