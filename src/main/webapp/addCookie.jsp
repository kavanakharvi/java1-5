<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
<title>Cookie Added</title>
</head>
<body>

<%
String name = request.getParameter("cname");
String value = request.getParameter("cvalue");
String ageStr = request.getParameter("cage");

if(name == null || value == null || ageStr == null){
%>
    <h3 style="color:red;">Invalid Input</h3>
    <a href="index.jsp">Go Back</a>
<%
    return;
}

int age = Integer.parseInt(ageStr);

// Create cookie
Cookie cookie = new Cookie(name, value);
cookie.setMaxAge(age);

// Add cookie
response.addCookie(cookie);
%>

<h2 style="color:green;">Cookie Added Successfully!</h2>

<p>Name: <%= name %></p>
<p>Value: <%= value %></p>
<p>Expiry Time: <%= age %> seconds</p>

<br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>