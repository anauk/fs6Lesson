console.log($("#city option:selected").text());
$('#city option:selected').removeAttr('selected');

//$("#city option:contains('Melbourne')").attr("selected", true);
$("#city option[value*='melbourne']").attr("selected", true);
console.log($("#city option:selected").text());
this.style.backgroundColor

