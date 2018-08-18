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
    let uniqueArr = new Array;
    for (let i = 0; i < arr.length; i++){
        if(!uniqueArr.includes(arr[i])) {
            uniqueArr.push(arr[i]);
        }
    }
  return uniqueArr;
}
console.log(unique);
alert(unique(values));

