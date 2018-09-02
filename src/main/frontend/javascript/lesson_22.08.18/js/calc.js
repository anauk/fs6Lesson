table.onclick = function (event) {
    let digit = parseInt(event.target.innerHTML);
    let ans = document.getElementById("ans");

    if (!isNaN(digit)) {
        if (ans.value == 0)
            ans.value = digit;
        else
            ans.value += digit;
    }else {
        callOperation(event.target.innerHTML);
    }
}
