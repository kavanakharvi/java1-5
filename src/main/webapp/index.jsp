<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Result</title>

<script>
function validateForm() {
    let fields = ["rollno","name","sub1","sub2","sub3","sub4","sub5"];

    for (let i = 0; i < fields.length; i++) {
        let value = document.forms["form"][fields[i]].value;
        if (value == "") {
            alert("All fields are required!");
            return false;
        }
    }

    return true;
}
</script>

<style>
.container {
    width: 350px;
    margin: 40px auto;
    padding: 20px;
    border: 1px solid #ccc;
}
</style>

</head>
<body>

<div class="container">
<h2>Student Result Form</h2>

<form name="form" action="processResult" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno"><br><br>
Name: <input type="text" name="name"><br><br>

Sub1: <input type="number" name="sub1"><br><br>
Sub2: <input type="number" name="sub2"><br><br>
Sub3: <input type="number" name="sub3"><br><br>
Sub4: <input type="number" name="sub4"><br><br>
Sub5: <input type="number" name="sub5"><br><br>

<input type="submit" value="Calculate Result">

</form>
</div>

</body>
</html>