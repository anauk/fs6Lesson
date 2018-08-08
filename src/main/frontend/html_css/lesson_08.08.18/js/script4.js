/*
Пользователь вводит диапазон нужно вывести на экран все простые числа из этого диапазона. Простыми числами называются числа, которые имеют всего 2 делителя, то есть
03
делятся только на 1 и на самого себя! Пример простых чисел: 3,5,7,11,13,17,...
*/

/* 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97*/

function simpleValueRange(start, end){
    for(let i = start; i<=end; i++ ){
        let isSimple=true;
        for(let j=2; j<i; j++){
            if(i%j==0){
                isSimple=false;
                break;
            }            
        }
        if(isSimple){
            console.log(i);            
        }
    }
    return true;
}

let start = prompt("Введите начало диапазона","");
start=Number(start);

let end = prompt("Введите конец диапазона","");
end=Number(end);

simpleValueRange(start, end);