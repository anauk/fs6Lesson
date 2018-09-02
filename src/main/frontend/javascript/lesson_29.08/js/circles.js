$(document).ready(function () {
    for (let i = 0; i < 300; i++) {
        let circle = $("<div class='circle'></div>");
        circle.css("background-color", getRandomColor());
        $("#canvas").append(circle);
    }

    function getRandomColor() {
        var letters = '0123456789ABCDEF';//#ffffff #000000
        var color = '#';
        for (var i = 0; i < 6; i++) {
            color += letters[Math.floor(Math.random() * 16)];
        }
        if (color=="#FFFFFF"){
            color = getRandomColor();
        } 
        console.log(color);
        return color;
    }
    //Math.random()* (max - min) + min;

});
