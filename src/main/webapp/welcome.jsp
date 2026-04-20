<%@ page language="java" %>
<html>
<body>

<%
String name = request.getParameter("uname");

// Store in session
session.setAttribute("user", name);

// Set expiry = 60 sec
session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>
<p>Session started (1 minute expiry).</p>

<a href="second.jsp">Check Session</a>

</body>
</html>