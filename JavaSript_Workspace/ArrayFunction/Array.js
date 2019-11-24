const hobbies = ['Sleeping', 'Cooking', 'Painting', 'Songs']
console.log(typeof hobbies);
const isArrayOrNot = Array.isArray(hobbies);
console.log('Hobbis Array or not ', isArrayOrNot);
const hasCooking = hobbies.includes('Cooking');
console.log('Using includes method ', hasCooking);

hobbies.push('Guitar','Vollyball');//add element at last position of array
console.log('After push method ', hobbies);

hobbies.pop()//remove element from last
console.log('After pop method ', hobbies);

hobbies.unshift('Music','Numismatics');//add element from first position
console.log(' Array After unshift',hobbies);

hobbies.shift();//remove element from first position
console.log('Array After shift',hobbies)


const hobbies1 = ['Sleeping', 'Cricket', 'Eating', 'Coding']

hobbies1.splice(1,2,'PubG')//add and remove element in between the array
console.log('After Splice Method ', hobbies1)

const afterSlice = hobbies1.slice(2,4)//remove Element in between the array
console.log('After Slice method',hobbies1)
console.log('After slice method', afterSlice)

const indexOfCoding = hobbies1.indexOf('Coding',1)//return index of the element
console.log('Index of coding =', indexOfCoding)

const joinOf = hobbies.join('-')//add separator and return array 
console.log('After join Hobbies =', joinOf)

console.log('==============================================')
console.log('Array of numbers')

const numbers = [100,200,300,400,500]
const numbers1 = []
for (let i = 0; i < numbers.length; i++) {
    let num = numbers[i]+50;
    numbers1.push(num);   
}
console.log(numbers1)

//Callback Function
const numbers2 = numbers.map(function (value, index){
    let newValue = value + 100;
    return newValue;
})
console.log('After Map Method ', numbers2)

//fat arrow function
const nums = numbers.map(value => value + 500)
console.log('After Map Arroww Function ', nums)

//filter method 
const filterNum = numbers.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log('After filter Function =', filterNum)

//fat arrow function for filter method

const num1 = numbers.filter(value => value > 100)
console.log('Fat arrow for filter fun =', num1)

console.log('=======Objects=============')

const items = [
    {
        name : 'Earning',
        id : 01,
        price : 1000
    },
    {
        name : 'Kajal',
        id : 02,
        price : 650
    },
    {
        name : 'Trimmer',
        id : 03,
        price : 3000
    },
    {
        name : 'Beardo gel',
        id : 04,
        price : 900
    },
    {
        name : 'Shoes',
        id : 05,
        price : 5000
    },
    {
        name : 'Shirts',
        id : 06,
        price : 2000
    }
]
const nums1 = items.map(value => value.price + 300)
console.log(nums1)
const number = items.filter(value => value.price >1000)
console.log(number)