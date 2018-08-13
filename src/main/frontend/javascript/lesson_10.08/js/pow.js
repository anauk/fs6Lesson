//Write a function pow(x,n) that returns x in power n, or in other words, multiplies x by  itself n times and returns the result
//e.g., pow(3, 4) = 3 * 3 * 3 * 3 = 81
//The function should support only natural values of n (i.e., integer from 1 up)
//Create a web page that prompts for x and n, and then shows the result of pow(x,n)

function pow (x, n){
    return false;
}

function getUsrInput(invitation){

    let usrInput = prompt(invitation);
    
    if (usrInput != null){
       if (usrInput = validateInput(usrInput)){
        return usrInput;
        }else {
            console.error("Wrong number format! Try again!");
            usrInput = getUsrInput(invitation);  
        } 
    }
    return false;
}

function validateInput(usrInput){  
    if ((usrInput = Number(usrInput)) && Number.isInteger(usrInput) && usrInput >= 1){ // () cooler than &&; && - lost; flowless victory
            return usrInput;
    } 
    return false;
}

 

function outPut() {

}

let usrInputX = getUsrInput("Please enter X");
console.log(usrInputX * 2);

let usrInputN = getUsrInput("Please enter N");

