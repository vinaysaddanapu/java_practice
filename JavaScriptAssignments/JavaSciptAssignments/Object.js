var humanBeing = {
hungry: true,
age   : 25,
height: 5.5

};

//console.log(humanBeing);

var pizza = {};

pizza.crust = 'wheat';
pizza.sauce = 'marinara';
pizza.cheese = 'mozzeralla';
pizza.toppings = 'cheese,pepporani,olives,mushrooms'

//console.log(pizza);

var cup = {};
cup['insulated'] = true;
cup['liquid'] = 'water';
cup['oz'] = 16;

console.log(cup);


var snowman = {
isSnow : true,
color  : 'white',
madeOfSnowballs: 3,
'first name': 'Frosty'

};

console.log(snowman.isSnow);
console.log(snowman.color);

snowman.isSnow = 'yes';
snowman.madeOfSnowballs=8;
snowman.color = 'orange';

console.log(snowman);

snowman['first name'] = "jack frosty";

console.log(snowman);

var house = {};

house.doors = 4;
house.bedrooms = 3;
house.address = '4219 S. Othello Street';
house.office = false;

house['swimming pool'] = false;
house['1st Owner']  = 'John Doe';
house['typeof'] = 'apartment';

console.log(house);

