'use strict'

function createCalendar(year, month){
    
    const months = [
        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    ];
    
    let hMonth = document.getElementById("headerMonth");
    hMonth.textContent = months[month];
    let hYear = document.getElementById("headerYear");
    hYear.textContent = year;
    
    let lastDate = new Date(year, month + 1, 0);
    let daysNum = lastDate.getDate();
    
    let daysList = document.getElementById("days");
    daysList.innerHTML = "";
    let lis = '';
    let shiftDays = (new Date(year, month, 1).getDay()+6)%7;
    for (let i = 0; i < shiftDays; i++) {
        lis += "<li></li>";
    }
    
    
    for (let i = 0; i < daysNum; i++) {
        lis += "<li>" + (i+1) + "</li>";
    }
    daysList.innerHTML = lis;
    
    if ( year === new Date().getFullYear() && month === new Date().getMonth()) {
        let days = document.getElementById("days").getElementsByTagName("li");
        days[new Date().getDate()].innerHTML = "<span class='active'>" + (new Date().getDate()) + "</span>";
    }    
    
}
function prevMonth () {
    if (--month < 0) {
        month = 11;
        year--;
    };
    createCalendar(year, month)
}
function nextMonth () {
    if (++month > 11) {
        month = 0;
        year++;
    };
    createCalendar(year, month)
}

let year = new Date().getFullYear();
let month = new Date().getMonth();
createCalendar(year, month);

//prev.addEventListener("click", prevMonth);
//next.addEventListener("click", nextMonth);

