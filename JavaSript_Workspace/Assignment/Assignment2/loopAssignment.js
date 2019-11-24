console.log('=====for loop=====')
console.log('Array 1')
var phones = ['Motorola', 'iPhone', 'Nokia', 'Lenovo']
for (var i = 0; i < phones.length; i++) {  
    console.log('Phones = ', phones[i] );
}


console.log('Array 2')

var person = ['Kirti', 'Vardhan', 'Singh']
for (var i =0; i < person.length; i++) {
    console.log('Person =', person[i]); 
}

console.log('array 3')

var city = ['Bangalore', 'Delhi', 'Pune', 'Mumbai']
for (var i =0; i <city.length; i++){
console.log("City =", city[i]);
}

console.log('Array 4')

var country = ['India', 'Pakistan', 'Japan', 'China', 'USA']
for (var i = 0; i < country.length; i++) {
   console.log('Country = ', country[i]); 
}

console.log('Array 5')

var books = ['To Kill a Mockingbird', 'The Great Gatsby', 'One Hundred Years of Solitude', 'Beloved']
for (var i = 0; i < books.length; i++) {
  console.log('Novels = ', books[i]);  
}

console.log('Array 6')

var series = ['GOT', 'FRIENDS', 'Vilkings', 'Strangers Thing']
for (var i =0; i<series.length; i++){
 console.log('TV Series = ', series[i]);
}

console.log('Array 7')

var car = ['BMW', 'Audi', 'Hummer', 'Jeep']
for (var i = 0; i < car.length; i++) {
  console.log('Cars = ', car[i]);  
}

console.log('Array  8')

var lang = ['Hindi', 'English', 'Kannada', 'Malayali']
for (var i = 0; i < lang.length; i++) {
 console.log('Language = ', lang[i]);   
}

console.log('Array 9')

var pen = ['Ink Pen', 'Dot Pen', 'Gel Pen', 'Marker Pen']
for (var i = 0; i < pen.length; i++) {
 console.log('Pen =', pen[i]);   
}

console.log('Array 10')

var id = ['001', '002', '003', '004']
for (var i = 0; i < id.length; i++) {
 console.log('Id = ', id[i]);   
}


console.log('=====for each loop=====')

console.log('Array 1')
var phones = ['Motorola', 'iPhone', 'Nokia', 'Lenovo']
phones.forEach(function (Value, index){
    console.log("Phones = ", Value);
});

console.log('Array 2')

var person = ['Kirti', 'Vardhan', 'Singh']
person.forEach(function (Value,index) {
    console.log("Person =", Value);
});

console.log('array 3')

var city = ['Bangalore', 'Delhi', 'Pune', 'Mumbai']
city.forEach(function (Value,index) {
    console.log("City = ", Value);
});

console.log('Array 4')

var country = ['India', 'Pakistan', 'Japan', 'China', 'USA']
country.forEach(function (Value, index){
   console.log('Country = ', Value); 
});

console.log('Array 5')

var books = ['To Kill a Mockingbird', 'The Great Gatsby', 'One Hundred Years of Solitude', 'Beloved']
books.forEach(function (value, index){
 console.log("Books = ", value);  
});

console.log('=====For of Loop=====');
console.log('Array 1')

var id = ['001', '002', '003', '004']
for (var element of id) {
 console.log('Value = ', element);   
}

console.log('Array 2')

var pen = ['Ink Pen', 'Dot Pen', 'Gel Pen', 'Marker Pen']
for (var element of pen) {
 console.log('Value = ', element);   
}

console.log('Array  3')

var lang = ['Hindi', 'English', 'Kannada', 'Malayali']
for (var element of lang) {
  console.log('Language = ', element);  
}

console.log('Array 4')

var car = ['BMW', 'Audi', 'Hummer', 'Jeep']
for (var element of car) {
    console.log('Car = ', element);
}

console.log('Array 5')

var series = ['GOT', 'FRIENDS', 'Vilkings', 'Strangers Thing']
for (var element of series) {
//    console.log('TV Series = ', series);
}
console.log('TV Series = ', series);


console.log('=====for in loop for Arrays=====')
console.log('Array 1')

var phones = ['Motorola', 'iPhone', 'Nokia', 'Lenovo'];
for (var index in phones) {
   console.log("Phones = ",  phones[index]);
}


console.log('Array 2')

var person = ['Kirti', 'Vardhan', 'Singh']
for (var index in person) {
    console.log('Person = ', person[index])
}

console.log('array 3')

var city = ['Bangalore', 'Delhi', 'Pune', 'Mumbai']
for (var index in city) {
    console.log("City = ", city[index])
}

console.log('Array 4')

var country = ['India', 'Pakistan', 'Japan', 'China', 'USA']
for (var index in country) {
   console.log('Country = ', country[index]); 
}

console.log('Array 5')

var books = ['To Kill a Mockingbird', 'The Great Gatsby', 'One Hundred Years of Solitude', 'Beloved']
for (var index in books) {
  console.log('Books = ', books[index]); 
}

console.log('===for in loop for object===')

var Cars = [ 
    {
      item : 'Audi',
      id : 01,
      color : 'black'
    },
    {
      item : 'Jeep',
      id : 02,
      color : 'White'
    },
    {
      item : 'Volvo',
      id : 03,
      color : 'Red'
    }

]
for (var key in Cars) {
    console.log("Cars =", Cars[key]);
  }

  var products = [
    {
      item : 'Soap',
      id : 1,
      price : 50
    },
    {
      item : 'Egg',
      id : 2,
      price : 120
    },
    {
      item : 'Bread',
      id : 3,
      price : 20
    },
    {
      item : 'Butter',
      id : 4,
      price : 120
    }
  ]
  for (var key in products) {
    console.log('Products = ', products[key]);
  }

  var phones = [
    {
      item : 'iPhone',
      price : 500000,
      color : 'Rose Gold'
    },
    {
      item : 'one pllus 6',
      price : 30000,
      color : 'black'
    },
    {
      item : 'Vivo',
      price : 20000,
      color : 'White'
    }
  ];
for (var key in phones) {
 console.log('Phones = ', phones[key]);
 }