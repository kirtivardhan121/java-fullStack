let h1Element = document.getElementById('demo');
console.log('Element =', h1Element)

console.log('Element text =', h1Element.textContent)
h1Element.textContent = 'Good Evening';
console.log('=======================')
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click Me!!!'
console.log('Button Element =', buttonElement)

document.body.appendChild(buttonElement);

console.log('=======================');

let ulElement = document.createElement('ul');
let li1Element = document.createElement('li');
let li2Element = document.createElement('li');
let li3Element = document.createElement('li');
let li4Element = document.createElement('li');

li1Element.textContent = 'JavaScript';
li2Element.textContent = 'Java';
li3Element.textContent = 'Sql';
li4Element.textContent = 'Html';

ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
ulElement.appendChild(li4Element);

document.body.appendChild(ulElement)

console.log('===========================');


h1Element.style.color = 'red';
h1Element.style.fontSize = '50px'

console.log('============Event=============');
//onclick event
function showMessage(){
    alert('Hi Hello Welcome!!!')
}

//on mouse hover
function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'green';
}
function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'black';
}

//on key up
function printHello(){
    // console.log('Hello!!')
   let username = document.getElementById('username').value
   document.getElementById('showusername').textContent = username;

}

let name = 'Vardhan'
let age = 21
let phoneno = 3365459653
console.log('Name is '+ name + ' Age is ' + age + ' Phone no is '+ phoneno)

console.log(`Name is ${name} Age is ${age} Phone no is ${phoneno}`)
console.log(`2 + 2 = ${2+2}`)

//Button Disabled 
document.getElementById('b1').disabled = false