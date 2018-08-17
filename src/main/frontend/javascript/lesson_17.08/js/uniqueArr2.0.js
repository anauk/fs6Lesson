/*
Let arr be an array
Create a function unique(arr) that should return an array with unique items of arr
Use set to make the function more efficient
For instance:
function unique(arr) {
 your code 
}
 alert(unique(values)); // John, Harry, Mary, Beth
*/
let values = ["John", "Harry", "Mary", "Harry", "Beth", "Harry", "Mary", "John"];

function unique(arr) {
    return Array.from(new Set(arr));
}

console.log(unique(values));
