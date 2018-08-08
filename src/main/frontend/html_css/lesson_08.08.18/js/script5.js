let number = prompt("Введите число");
number = Number(number);
let result = 1;
for (let i=1; i<=number;i++){
    result = result*i;
}
console.log(result);