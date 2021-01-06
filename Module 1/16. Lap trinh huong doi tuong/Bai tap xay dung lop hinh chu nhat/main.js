class Rectangle {
    constructor(width, height) {
        this.width = width;
        this.height = height;
        }
        getArea(){
            return this.width * this.height
        }
        getParameter() {
            return (this.width + this.height) * 2
        }
        draw() {
            var ctx = document.getElementById('myCanvas');
            var c = document.getElementById('myCanvas');
            var ctx = c.getContext('2d');
            ctx.moveTo(0, 0);
            ctx.lineTo(0, this.height);
            ctx.moveTo(0, this.height);
            ctx.lineTo(this.width, this.height);
            ctx.moveTo(this.width, this.height);
            ctx.lineTo(this.width, 0);
            ctx.moveTo(this.width, 0);
            ctx.lineTo(0, 0);
            ctx.stroke();
        }
}

let hcn=new Rectangle(300,150)

hcn.draw()
 hcn.width=250;
 hcn.height=150;
let dientich=hcn.getArea();
let chuvi=hcn.getParameter()

console.log(hcn.width)
console.log(hcn.height)
console.log(hcn)
console.log('Dien tich hinh chu nhat: '+dientich)
console.log('Chu vi hinh chu nhat: '+chuvi)