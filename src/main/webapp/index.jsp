<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Cookie Management</title>
<style>
.container {
    margin: 20px;
    padding: 20px;
    width: 350px;
    border: 1px solid #ccc;
}
</style>
</head>
<body>

<div class="container">
<h2>Add Cookie</h2>

<form action="addCookie.jsp" method="post">
    Name: <input type="text" name="cname" required><br><br>
    
    Domain/Value: <input type="text" name="cvalue" required><br><br>
    
    Max Expiry Age (sec):
    <input type="number" name="cage" required><br><br>
    
    <input type="submit" value="Add Cookie">
</form>

</div>

</body>
</html>