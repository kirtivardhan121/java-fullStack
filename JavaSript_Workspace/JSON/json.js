const person = {
    name : 'Vardhan',
    age : 22,
    address : {
        city : 'Delhi',
        state : 'UP',
        pincode : 456544
    },
    hobbies : ['Coding', 'Netflix', 'Traveller']
}

console.log('JavaScript person Object =', person)
const jsonObject = JSON.stringify(person)
console.log('JSON person Object =', jsonObject)

const JavaScriptpersonObject = JSON.parse(jsonObject)
console.log('Javascript person object after parse =', JavaScriptpersonObject)

localStorage.setItem('email', 'vardhan@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email id =', emailID)
localStorage.clear();