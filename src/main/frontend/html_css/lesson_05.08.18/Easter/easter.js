function easterDate(year){
    let a = year%19;
    let b = year%4;
    let c = year%7;
    let d = (19*a+15)%30;
    let e = (2*b+4*c+6*d+6)%7;
    let f = d+e;
    if (f<=26){
        year = (4+f) + " апреля";
    } else {
       year = (f-26) + " мая"; 
    }
return year;
}

function isNumber(yearValue){
    if (yearValue === null){
        yearValue = prompt("Если хотите посчитать дату Пасхи, введите год");
    }
    //    if (!Number(yearValue)){
//        yearValue = prompt("Введите год числом и без пробелов");
//    }
//    if (Number.isNaN(Number(yearValue))){
//        yearValue = prompt("Введите год числом и без пробелов");
//    }
    if (Number.isNaN(+yearValue)){
        yearValue = prompt("Введите год числом и без пробелов");
    }
    return Number(yearValue);
}

let year = prompt("Введите интересующий Вас год");
year = isNumber(year);
if (year === null || Number.isNaN(+year)){
    
} else {
    let resultDate = easterDate(year);
    console.log(resultDate);
}



