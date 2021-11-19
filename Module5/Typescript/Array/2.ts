// Declare a tuple type
let x: [string, number,number];
// Initialize it
x = ["hello", 10]; // OK
// Initialize it incorrectly
// x = [10, "hello"]; // Error

console.log(x[0].substr(1)); // OK
// console.log(x[1].substr(1));
// Error, Property 'substr' does not exist on type 'number'.

x[1] = "world";
// OK, 'string' can be assigned to 'string | number'
x[2] = 100.25;
console.log(x[2].toString());
// OK, 'string' and 'number' both have 'toString'

// x[6] = true; // Error, 'boolean' isn't 'string | number'