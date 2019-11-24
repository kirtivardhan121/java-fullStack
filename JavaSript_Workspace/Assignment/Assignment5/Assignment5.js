/*function validation(){
    var fname = document.login.fname.value;
    var password = document.login.password.value;
    //check empty field
    if(fname==="" || password===""){
        alert('Both feilds should not be bank');
        return;
    }
}

//check size of password
if(password.length<6 || password.length>12){
    alert('Password must be 6 to 12 characters');
    return;
}

//username should not start with _, @ and number
var star=fname.slice(0,1);
if(fname.slice(0,1)===' ' || fname.slice(0,1)==='@' || str.match(/[0-9]/g)!=null)
{
alert('Username should not start with _, @ and number');
return;
}*/

function validation_func(){
    var fname = document.getElementById("firstname").value;
    var password = document.getElementById("passvalue").value;
    alert("inside submit");
}
function validation_function(){
    var eye = document.getElementById('passvalue')
    if(eye.type === 'password'){
        eye.type = 'text';
    }else{
        eye.type = 'password';
    }
}

function validate_fname(){
    var fname = document.getElementById("firstname").value;
    var fname_len = fname.length;
    if(fname_len < 5 ){
        document.getElementById('err').innerHTML = 'First name should be greater than 4 characters'
        err.style.color = 'red';
        document.getElementById("mybtn").disabled = true;
    }else{
        document.getElementById('err').innerHTML = ''
        document.getElementById("mybtn").disabled = false;
    }
}

function validate_pass(){
    var password = document.getElementById("passvalue").value;
    var password_len = password.length;
    if(password_len < 5 ){
        document.getElementById('err').innerHTML = 'Password should be greater than 6 characters'
        err.style.color = 'red';
        document.getElementById("mybtn").disabled = true;
    }else{
        document.getElementById('err').innerHTML = ''
        document.getElementById("mybtn").disabled = false;
    }
}
