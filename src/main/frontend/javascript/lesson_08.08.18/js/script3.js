//Get from the user a number
//Print to the console a square of stars whose length is the number specified by the user
//For example, if the user entered the number 15, your should print:
//
//Hint: Use the character ‘\n’ to start a new 

let number = prompt("enter a number");
console.log(number);
while(isNaN(number)){
    number = prompt("enter a number once more");
}
number = Number(number);
for(let i = 0; i < number; i++){
    let line = '';
     for (let j = 0; j <= number; j++){
         line += "*";
     }  
    console.log(line+"\n");
}