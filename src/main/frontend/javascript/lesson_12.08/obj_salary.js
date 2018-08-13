/*We have an object storing salaries of our team:
let salaries = {  John: 100,
Ann: 160,
Peter: 130
}
Write the code to sum all salaries and store in the variable sum
→    Should be 390 in the example above
→    If salaries is empty, then the result must be 0*/

function sumProperty(objectName) {
    let result = 0;
    for(let key in objectName){
        result += objectName[key];        
    }
    return result;
};
let salaries = {  John: 100,
Ann: 160,
Peter: 130                
};
salaries.sum = sumProperty(salaries);
console.log(salaries);