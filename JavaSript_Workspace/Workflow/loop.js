var brands = ['Kingfisher','Bisleri','Aqua','Kinley']
console.log("Forof loop")
for (const elements of brands) {
    console.log("Brand = ", elements);
    
}


console.log("=============================");

console.log("for in loop");
 var cars = ['Audi','Humer','Jeep'];
 for (var index in cars) {
     console.log("Cars =", cars[index]);
         
     }

console.log("for in loop for object");

var person = {
    name : 'Sundari',
    age : 33,
    color : 'fair',
}
for (var key in person) {
    console.log('Value = ', person[key]);
}
 

console.log("=====================");
console.log("for each loop  method of array");

var movie = ['Sholay','Maya','Titanic']
movie.forEach(function(Value,index){
    console.log("movie = ", Value)
});

console.log('======================');
console.log("for in lopp method for object");

var items = [
    {
        item : 'Bangles',
        id : 1,
        price : 100
    },
    {
        item : 'Eyeliner',
        id : 2,
        price : 500
    },
    {
        item : 'Shoes',
        id : 3,
        prrice : 5000
    },
    {
        item : 'Watch',
        id : 4,
        price : 4000
    }
]
for (var key in items) {
    console.log("Items = ", items[key]);
}


