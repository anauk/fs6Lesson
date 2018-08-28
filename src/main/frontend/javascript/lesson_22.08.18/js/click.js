//Add JavaScript to the button to make <div id="text"> disappear when we click it
//<input type="button" id="hider" value="Click to hide the text" />
//<div id="text">Text</div>
//<script>
///* your code */
//</script>
function switchDisplayMode() {    
    if (document.getElementById('text').style.display != "none"){
        document.getElementById('text').style.display = "none";
    }else {
        document.getElementById('text').style.display = "block";
    }    
}

function hiderButton(){
    event.target.style.display = "none";
}

document.getElementById('hider').addEventListener('click', switchDisplayMode);


document.getElementById('hider-button').addEventListener('click', hiderButton);