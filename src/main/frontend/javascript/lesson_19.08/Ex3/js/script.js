
let table = document.getElementById("age-table");
table.style.border = "2px solid red";
/*
let labels = table.getElementsByTagName("label");
for (let i of labels) {
    i.style.color = "pink";
}
*/
let elements = document.querySelectorAll('#age-table td:first-child');

elements[0].style.backgroundColor = "red";

let inputSearch = document.querySelector('form[name=search]');
    inputSearch.style.border = '5px dotted green';
let firstFormInput = document.querySelector('form input:first-child');
    firstFormInput.style.marginBottom = "30px" ;
let lastFormInput = document.querySelector('form input[type="text"]:last-child');
    lastFormInput.style.color = "blue" ;