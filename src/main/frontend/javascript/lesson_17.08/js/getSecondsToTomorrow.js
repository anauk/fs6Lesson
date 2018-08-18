/*Create a function getSecondsToTomorrow() that returns the number of seconds till  tomorrow
For instance, if now is 23:00, then:
getSecondsToTomorrow() == 3600
Note that the function should work at any day*/

function getSecondsToTomorrow() {
    let currentTime = new Date();
    let tommorowTime = new Date(currentTime.getFullYear(), currentTime.getMonth(), (currentTime.getDate() + 1));
    console.log(Math.floor((tommorowTime.getTime() - currentTime.getTime())/1000));
 
}

getSecondsToTomorrow();
