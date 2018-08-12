/*
→    Create an object calculator with three methods:
→    read() prompts for two values and saves them as object properties
→    sum() returns the sum of saved values
→    mul() multiplies saved values and returns the result
let calculator = {
// ... your code ...
};

calculator.read();  alert(calculator.sum());  alert(calculator.mul());
*/

let calculator = {
    //    one: null,
    //    two: null,

    read: function () {
        this.one = Number(prompt("enter value one"));
        this.two = Number(prompt("enter value two"));
    },

    sum: function () {
        return this.one + this.two;
    },
    
    multiply: function () {
        return this.one * this.two;
    }
}

calculator.read();
console.log(calculator);

console.log(calculator.sum());
console.log(calculator.multiply());
