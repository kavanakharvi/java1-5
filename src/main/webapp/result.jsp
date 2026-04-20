<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
<title>Result</title>
<style>
.container {
    width: 350px;
    margin: 40px auto;
    padding: 20px;
    border: 1px solid #ccc;
}
.pass { color: green; }
.fail { color: red; }
</style>
</head>
<body>

<div class="container">
<h2>Student Result</h2>

<%
String msg = (String) request.getAttribute("message");
%>

<p><b><%= msg %></b></p>

<% if(request.getAttribute("name") != null) { %>

<p>Roll No: <%= request.getAttribute("rollno") %></p>
<p>Name: <%= request.getAttribute("name") %></p>

<p>Sub1: <%= request.getAttribute("s1") %></p>
<p>Sub2: <%= request.getAttribute("s2") %></p>
<p>Sub3: <%= request.getAttribute("s3") %></p>
<p>Sub4: <%= request.getAttribute("s4") %></p>
<p>Sub5: <%= request.getAttribute("s5") %></p>

<p>Average: <%= request.getAttribute("average") %></p>

<%
String res = (String) request.getAttribute("result");
if ("PASS".equals(res)) {
%>
    <p class="pass">Result: PASS</p>
<%
} else {
%>
    <p class="fail">Result: FAIL</p>
<%
}
%>

<% } %>

<br>
<a href="index.jsp">Back to Form</a>

</div>

</body>
</html>