import { Shape } from "./Shape";
import { Circle } from "./Circle";
import {Rectangle} from "./Rectangle";
let shape = new Shape(5,10);
let cirlce =new Circle(5,10,20);
let rectangle = new Rectangle(5,10,10,20);

console.log(shape.getInfor());
console.log(cirlce.getInfor());
console.log(rectangle.getInfor());
