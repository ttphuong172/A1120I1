let myArray:number[]=[1,2,4,3,6];
let total:number=0;
for(let i=0;i<myArray.length;i++){
    console.log(myArray[i]);
    total+=myArray[i]
}
console.log(total);
console.log(total/myArray.length);