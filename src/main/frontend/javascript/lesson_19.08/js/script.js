/*
получить ссылку на элементы
покрасить 1, 5, 9, 16 ячейки
переделать это с помощью универсальной функции
*/
/*
cells[0].style.backgroundColor="red";
cells[5].style.backgroundColor="red";
cells[10].style.backgroundColor="red";
cells[15].style.backgroundColor="red";
*/

/*
функция должна изменять указанной свойство Н-ому элементу переданного масива
*/

function changeCss(elementsArray, whichElement, propertyName, propertyValue) {
    
    if(elementsArray[0].style[propertyName] === undefined){
        alert("property name is incorrect");
        return false;
    }
    
    for (let i = 0; i < elementsArray.length; i += whichElement){
        elementsArray[i].style[propertyName] = propertyValue;
    }
    
    return true;
}

let cells = document.getElementsByTagName('td');

changeCss(cells, 5, "backgroundColor", "red");




