function employee_validate(){

    var id=document.getElementById("id").value
    var name=document.getElementById("name").value
    var age=document.getElementById("age").value
    var dob=document.getElementById("dob").value
    var email=document.getElementById("email").value
    var time=document.getElementById("time").value

    if(id=='')
    {
        alert('id is blank')
        return false
    }
    
    else if(name=='')
    {
        alert('name is blank')
        return false
    }
    else{
        return true
    }


}