/**
 * Created by admin on 12/8/2020.
 */
function logIn(){
    var userName=document.getElementById('username').value;
    var passWord=document.getElementById('password').value;
    if (userName=='Admin'){
        if (passWord=='TheMaster')
           document.getElementById('result').innerHTML="Welcome"
        else if (passWord == null)
            document.getElementById('result').innerHTML="Canceled"
        else
            document.getElementById('result').innerHTML="Wrong password"
    }
    else if (userName==null){
        document.getElementById('result').innerHTML="Canceled"
    }
    else{
        document.getElementById('result').innerHTML="I don’t know you"
    }


}