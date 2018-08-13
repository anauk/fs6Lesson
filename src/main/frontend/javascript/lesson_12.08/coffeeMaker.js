//Написать объект Кофеварка со всеми типичными свойствами и методами: приготовление кофе, очистка жмыха и т.д.

/*
Объект "кофеварка" унего 

свойства
вода
кофе в зернах
молоко
жмых-контейнер 

и методы
"добавить воды"
"добавить кофе в зернах"
"добавить молоко"
"опустошить жмых-контейнер"

"сделать эспрессо"
"сделать американо"
"сделать капучино"
    //        recipe: {
    //            coffee: {
    //                cuppucino: 20,
    //                americano: 10,
    //                esspresso: 10
    //            }
    //       }

*/

let coffeeMaker = {
    water: 1000,
    coffee: 100,
    milk: 500,
    waste: 1000,

    recipe: {
        cuppucino: {
            coffee: 10,
            water: 200,
            milk: 20,
            waste: 10
        },
        americano: {
            coffee: 10,
            water: 200,
            milk: 0,
            waste: 10
        },
        esspresso: {
            coffee: 20,
            water: 50,
            milk: 0,
            waste: 20
        }
    },
    addWater: function () {
        this.water += Number(prompt("Введите количество воды, которое Вы хотите долить"));
    },

    addCoffee: function () {
        this.coffee += Number(prompt("Введите количество кофе в зернах, которое Вы хотите добавить"));
    },

    addMilk: function () {
        this.milk += Number(prompt("Введите количество молока, которое Вы хотите долить"));
    },

    emptyWaste: function () {
        this.waste = 0;
    },

    maxRecipeValue: function (value) {
        let maxRecipeValue = 0;
        for (let key in this.recipe) {
            if (maxRecipeValue < this.recipe[key].value) {
                maxRecipeValue = this.recipe[key].value;
            }
        }
        return maxRecipeValue;
    },

    makeCoffee: function (drink) {
        if (this.water >= this.recipe[drink].water && this.coffee >= this.recipe[drink].coffee && this.waste < this.recipe[drink].waste) {
            this.water -= this.recipe[drink].water;
            this.coffee -= this.recipe[drink].coffee;
            this.waste += this.recipe[drink].waste;
        }
        this.checkValue();
        if (this.waste >= 1000) {
            let dumpWaste = confirm("Хотите очистить жмых?");
            if (dumpWaste) {
                this.waste = 0;
            } else {
                alert("Дальнейшее приготовление кофе не возможно");
            }
        }
    },

    checkValue: function () {
        let i = 1;
        for (let key in this) {
            if (this[key] <= this.maxRecipeValue(this[key])) {
                this[key] += Number(prompt("Добавьте не менее" + this.maxRecipeValue(this[key]) - this[key] + key));
            }
            i++;
            if (i == 4) {
                break;
            }
        }
    }
};

let drinkName = prompt("What coffe do you want?");
coffeeMaker.makeCoffee(drinkName);
console.log(coffeeMaker);
