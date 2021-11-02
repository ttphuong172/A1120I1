import {Component, OnInit} from '@angular/core';
import {operators} from "rxjs/internal/Rx";

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  public numberFirst: number = 0;
  public numberSecond: number = 0
  public operator: string = "+";
  public result: number = 0;

  constructor() {
  }

  ngOnInit(): void {
  }

  onChangeNumberFirst(event: any) {
    this.numberFirst = event.target.value;
  }

  onChangeOperator(event: any) {
    this.operator = event.target.value;
  }

  calculator() {
    switch (this.operator) {
      case "+":
        this.result = this.numberFirst + this.numberSecond;
        break;
      case "-":
        this.result = this.numberFirst - this.numberSecond;
        break;
      case "*":
        this.result = this.numberFirst * this.numberSecond;
        break;
      case "/":
        this.result = this.numberFirst / this.numberSecond;
        break;


    }
  }

}
