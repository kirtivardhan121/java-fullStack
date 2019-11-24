const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name : 'Kirtivardhan',
            age : 22
        },
        {
            name : 'Rajvardhan',
            age : 18
        },
        {
            name : 'RajeevPratap',
            age : 18
        }
        ])
    }else{
        reject('Failed')
    }
})
message.then(function(msg){
    console.log('Sucess Message', msg)
}).catch(function(error){
    console.log('Failure Message', error)
})


console.log('===========================')

const employee = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name : 'UtkalPratap',
            age : 15
        },
        {
            name : 'AmanPratap',
            age : 8
        },
        {
            name : 'AbhayPratap',
            age : 5
        }
        ])
    }else{
        reject('Failed')
    }
})
employee.then(function(data){
    console.log('Eployee Data', data)
}).catch(function(error){
    console.log('Failure Message', error)
})

//Clousers
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value =', counter)