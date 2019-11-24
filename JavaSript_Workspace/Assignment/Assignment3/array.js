
console.log('===sum of number in array===');

function sum(input){
             
    if (toString.call(input) !== "[object Array]")
       return false;
         
               var total =  0;
               for(var i=0;i<input.length;i++)
                 {                  
                   if(isNaN(input[i])){
                   continue;
                    }
                     total += Number(input[i]);
                  }
                return total;
               }
   console.log(sum([10,20,30,40]));

   //fat arrow function

   var s = sum => {
            var total =  0;
            for(var i=0;i<sum.length;i++)
              {                  
                total+=sum[i];
               }
             return total;
            }
    arr=[20,40,60];
   console.log(s(arr)); 