//Name Functions

function add(num1,num2){
    console.log('Sum =', num1+num2);
    
}
add(10,20)

//Function Expression (Anonyous)

var sub = function(num1,num2){
    var subValue = num1 - num2 ;
    return subValue;
}
var value = sub(90,76);
console.log('Value =', value);
/*
function add(num1,num2,num3){
    console.log('Value', num1+num2+num3);
}
add(10,20,30)*/

//silf invoked function


    (function(num1,num2)
    {
    console.log('Value =', num1/num2);
    })
 (20,10)

//Fat Arrow function
var div = (num1, num2)=>{
    console.log('Value =', num1/num2);
}
div(20,10)


var greet = function(msg){
    console.log('Hi',msg);
}
greet("Dinga");


greet('Vardhan');
var greets=(msg)=>{
    console.log('hi',msg);
}

//variable hoisting

console.log(hoist);
var hoist=10;

function hoisting(){
    console.log(hoistingA)
    var hoistingA = 10;
}
hoisting(10);