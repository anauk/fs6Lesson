/* Написать универсальную функцию, которая увеличивает или уменьшает значение на указанную величину. которая получает ссылку на элемент, название свойства, размер которого нужно изменить, значение, на которое нужно изменить */

function changeStyle (property, value) {
    let newStyle = this.style[property].slice(0, this.style[property].indexOf('px'));
    console.log(this.style[property]);
    newStyle = Number(newStyle) + value + 'px';
    this.style[property] = newStyle;
    return newStyle;
}

let elem = document.getElementById("text-container");  // Получаем id тега
let style = getComputedStyle(elem);

changeStyle.call(elem, "margin", 40 );