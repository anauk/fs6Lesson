//Write a function checkSpam(str) that returns true if str contains ‘viagra’ or ‘XXX’,  otherwise false
//The function must be case-insensitive:
//alert(checkSpam('buy ViAgRA now')); // true
//alert(checkSpam('free xxxxx')); // true
//alert(checkSpam("innocent rabbit")); // false

function checkSpam(str){
   str = str.toLowerCase();
    if (str.includes("viagra") || str.includes("xxx")){
    return true;
    }else 
        {return false}
}
let str = 'buy ViAgRA now';
let str2 = 'free xxxxx';
let str3 = "innocent rabbit";

console.log(checkSpam(str));
console.log(checkSpam(str2));
console.log(checkSpam(str3));