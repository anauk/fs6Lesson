//Get from the user two numbers: min and max
//Output all the even numbers between min and max (note that min and max
//themselves might be odd numbers)
//For example, if the user enters min = 5 and max = 14, you should print the numbers  6,8,10,12,14

function validation (value){
    while(isNaN(value)) {
    value = prompt("Введите границу интервала ввиде положительного числа без пробелов");
}
    return Number(value);
}


let min = prompt("Введите начало интервала в формате положительного натурального числа");
min = validation(min);

let max = prompt("Введите число конец интервала в формате положительного натурального числа");
max = validation(max);

while (max <= min){
    max = prompt("Введите конец ввиде положительно числа большего, чем " + min);
}

for (let i = min; i <= max; i++) {
    if (i%2 == 0) {
        console.log(i);
    }
}

