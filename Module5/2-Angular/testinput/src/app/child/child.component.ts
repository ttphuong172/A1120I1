import {Component, DoCheck, Input, OnChanges, OnInit, SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit,OnChanges,DoCheck {

  @Input() count_child: any;
  constructor() {
    console.log("input test")
  }

  ngOnInit(): void {
    console.log("Init");
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('Onchange'+JSON.stringify(changes));
  }
  increment(){
    this.count_child++;
  }

  ngDoCheck(): void {
    console.log("Do check" + this.count_child);
  }

}
