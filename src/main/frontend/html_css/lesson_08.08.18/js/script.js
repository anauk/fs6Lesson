/*
Ask the user to enter a number
If the user provides a non-numeric value (such as “abc”), display an error message and ask the user to try again
Hint: use the function isNaN() to check if the conversion to number failed
*/


let aNumber = prompt("enter a number, please");
console.log(aNumber);

while (isNaN(aNumber)){
    aNumber = prompt("Error! enter a number AGAIN, please");
    
    }

