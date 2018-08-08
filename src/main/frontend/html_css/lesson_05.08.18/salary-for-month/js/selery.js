function getSalary(salary, month) {
    let result;
    switch (month) {
        case "январь":
        case "март":
        case "май":
        case "июль":
        case "август":
        case "октябрь":
        case "декабрь":
            result = salary * 23;
            break;
        case "февраль":
            result = salary * 20;
            break;
        case "апрель":
        case "июнь":
        case "сентябрь":
        case "ноябрь":
            result = salary * 22;
            break;
        default:
            result = "Такого месяца не существует";
    }
    return result;
}
function isNumber(dateValue) {
    if (dateValue === null) {
        dateValue = prompt("Если хотите узнать зарплату, введите зврплату за день");
    }    
    if (Number.isNaN(+dateValue)) {
        dateValue = prompt("Введите зарплату числом в долларах ");
    }
    console.log(dateValue);
    return Number(dateValue);    
}


let salaryDay = prompt("Введите стоимость одного рабочего дня", "");
salaryDay = isNumber(salaryDay);
let month = prompt("Введите месяц", "");
month = month.toLowerCase();
let salary = getSalary(salaryDay, month);
console.log(salary);
