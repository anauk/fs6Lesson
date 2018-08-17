//Write a function subArrayZero(arr) that gets an array and returns whether it contains  a contiguous subarray whose sum is equal to 0
//→    Your function should go over the array elements only once


function subArrayZero(arr) {
   for(let i =0; i<arr.length;i++){
       let sum =arr[i];
       for(let j =i+1; j<arr.length;j++){
           sum+=arr[j];
           if(sum===0){
               return true;
           }
       }
   }
    return false;
}


console.log(subArrayZero([-5, 12, 4, -7, 2, 1, 8])); // true, 4 + (-7) + 2 + 1 = 0
console.log(subArrayZero([3, -2, -6, 2, 1, -2])); // falseconsole.log(subArrayZero([3, -2, -6, 2, 1, -2])); // false