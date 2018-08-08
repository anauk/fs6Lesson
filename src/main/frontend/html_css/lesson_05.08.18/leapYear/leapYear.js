function isNumber(yearValue) {
    if (yearValue === null) {
        yearValue = prompt("Если хотите проверить год на высокосность, введите год");
    }
    //    if (!Number(yearValue)){
    //        yearValue = prompt("Введите год числом и без пробелов");
    //    }
    //    if (Number.isNaN(Number(yearValue))){
    //        yearValue = prompt("Введите год числом и без пробелов");
    //    }

    if (Number.isNaN(+yearValue)) {
        yearValue = prompt("Введите год числом и без пробелов");
    }
    return Number(yearValue);
}

function leapDate(yearValue) {
    let answer = ' не высокосный год';
  
    if (yearValue % 400 == 0 || (yearValue % 4 == 0 && yearValue % 100 != 0)) {
        answer = ' высокосный год';
    }
    
    return answer;
    
   /* //Год високосный, если он делится на четыре без остатка, 
    if (yearValue % 4 == 0) {
        answer = ' высокосный год';
    }

    //но если он делится на 100 без остатка, это не високосный год
    if (yearValue % 100 == 0) {
        answer = ' не высокосный год';
    }

    //Однако, если он делится без остатка на 400, это високосный год. 
    if (yearValue % 400 == 0) {
        answer = ' высокосный год';
    }
*/
  
}

let year = prompt("Введите интересующий Вас год");
year = isNumber(year);

if (year != null || !Number.isNaN(+year)) {
    let theAnswer = leapDate(year);
    console.log(year + theAnswer);
}
