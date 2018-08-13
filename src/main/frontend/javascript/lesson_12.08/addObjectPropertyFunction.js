//Write functions, that universaly ask user new object value and property, and add it to your object

function askProperty(functionName, objectName){
let nameProperty = prompt('Please, type the property name');
    if(nameProperty != null){
      let valueProperty = prompt('Please, type the value ');
        functionName(nameProperty,valueProperty, objectName);
        return true;
//     return   let productValue = [nameProperty, valueProperty];
    } 
    return false;
};

function addProperty(name, value, objectName){
    objectName[name] = value; 
    return true;
};

//let productValue = askProperty();
//addProperty(productValue);

let product = {};

product.name = 'laptop';
product.price = 1200;

askProperty(addProperty, product);
console.log(product);

