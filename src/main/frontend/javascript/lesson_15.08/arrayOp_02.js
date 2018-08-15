/*Let’s try 5 array operations:
Create an array styles with items “Jazz” and “Blues”
Append “Rock-n-Roll” to the end
Replace the value in the middle by “Classics”
→    Your code for finding the middle value should work for any arrays with odd length
Strip off the first value of the array and show it
Prepend Rap and Reggae to the array
→    The array in the process:
azz, Blues
Jazz, Bues, Rock-n-Roll  Jazz, Classics, Rock-n-Roll  Classics, Rock-n-Roll
Rap, Reggae, Classics, Rock-n-Roll*/

function middleAr(arr){
   if(arr.length % 2 == 0){
       console.log("Please enter the array with odd length");
   } else{
       arr[Math.floor(arr.length/2)] = "Classics"; 
   }
}

let music=['Jazz', 'Blues'];
music[2] = 'Rock-n-Roll';
console.log(music);
middleAr(music);
console.log(music);
music.shift();
console.log(music);
music.unshift("Rap", "Reggae");
console.log(music);


/*
let a = [1, 2, 3];
let b = a;
a.shift();
console.log(b);
*/

