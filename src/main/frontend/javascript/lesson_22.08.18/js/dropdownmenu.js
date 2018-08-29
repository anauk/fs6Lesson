

/*
Create a menu that opens/collapses on click:
The HTML/CSS of the source document should also be modified
The arrow symbols are Unicode characters that can be copied from https://unicode-  table.com/en/sets/arrows-symbols/
*/

function menuCollapse() {
    let menu = document.getElementById("myMenu");
    if(!menu.classList.contains("in")){
       menu.classList.add("in"); 
    }else{
        menu.classList.remove("in");
    }
   
}

downMenu.addEventListener("click", menuCollapse);
