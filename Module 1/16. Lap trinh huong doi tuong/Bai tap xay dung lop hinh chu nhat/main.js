var Rectangle =function (width,height) {
    this.width=width;
    this.height=height;
    this.getArea=function () {
        return width*height
    }
    this.getParameter=function () {
        return (width+height)*2
    }
    this.draw =function () {
        var ctx=document.getElementById('myCanvas');

    }
}

let hcn=new Rectangle(12,8)
hcn.width=20;
hcn.height=10;
let dientich=hcn.getArea();
let chuvi=hcn.getParameter()

console.log(hcn.width)
console.log(hcn.height)

console.log('Dien tich hinh chu nhat: '+dientich)
console.log('Chu vi hinh chu nhat: '+chuvi)