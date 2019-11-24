console.log('Window object', window);
console.log('This Keyword', this);
console.log(this === window);

// window.alert('welcome to Javascript Class')
// alert('Welcome UST Global')

// let confirmDelete = confirm('Are you sure you want to delete');
// console.log('Confirm Delete', confirmDelete);

// let userName = prompt('What is your Name', 'Vardhan');
// console.log('User Name', userName);


const person = {
    firstName : 'Alia',
    age : 26,
    lastName : 'Kapoor',

    getName : function(){
        return this.firstName + ' ' + this.lastName
    }  
}
let fullName = person.getName()
console.log('Full Name ', fullName);