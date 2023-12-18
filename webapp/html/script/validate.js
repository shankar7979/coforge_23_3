function employee_validate() {

    var id = document.getElementById("id").value
    var name = document.getElementById("name").value
    var age = document.getElementById("age").value
    var dob = document.getElementById("dob").value
    var email = document.getElementById("email").value
    var time = document.getElementById("time").value

    if (id == '') {
        alert('id is blank')
        document.getElementById('id').style.border = "2px solid red"

        return false
    }

    else if (name == '') {
        alert('name is blank')
        document.getElementById('id').style.border = "1px solid black";
        document.getElementById('name').style.border = "2px solid red"
        return false
    }
    else if (name.length<5 || name.length>10) {
        alert('name length must of 5 - 10 chars')
         document.getElementById('name').style.border = "2px solid red"
        return false
    }

    else if (age == '') {
        alert('age is blank')
        document.getElementById('name').style.border = "1px solid black"
        document.getElementById('age').style.border = "2px solid red";
        return false
    }


    else {
        return true
    }


}