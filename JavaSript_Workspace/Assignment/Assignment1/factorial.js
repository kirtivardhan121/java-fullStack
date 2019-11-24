//name function

console.log('===factorial of a number===')
function factorial(x){
    if(x===0){
        return 1;
    }
    return x * factorial(x-1); 
}
console.log(factorial(5));

//function Expression(Anonyoous)

var fact = function (x){
    if(x===0){
        return 1;
    }
    return x * fact (x-1);
}
var value = fact(5);
console.log("value =", value);

//self invoked function

var factorial = function fac(n){
    return n<2?1 : n * fac(n-1);
};
    console.log('Factorial =', factorial(3) );


//fat Arrow function

var factorial = (n) => {
    if(n===0){
        return 1;
    }
    return n * factorial (n-1);
}
console.log('Factorial =',factorial(7));