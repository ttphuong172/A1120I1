var myArray = [1, 2, 4, 3, 6];
var total = 0;
for (var i = 0; i < myArray.length; i++) {
    console.log(myArray[i]);
    total += myArray[i];
}
console.log(total);
console.log(total / myArray.length);
