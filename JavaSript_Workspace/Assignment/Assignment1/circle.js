//named function
console.log('===Circumference of a circle===');

function circle(r){
    this.r = r;
    this.circumference = function (){
        return 2*Math.PI*this.r;

    } 
    };
var value = new circle(6);
console.log("Circumference =", value.circumference().toFixed(5));

//fat arrow function

var circle = (r) => {
    
    this.r = r;
    this.circumference = function (){
        return 2*this.Math.PI*this.r;

    }
};
console.log('circuference =',value.circumference().toFixed(5));