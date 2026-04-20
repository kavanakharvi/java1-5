<%@ page language="java" %>
<html>
<body>

<%
String name = request.getParameter("uname");
int time = Integer.parseInt(request.getParameter("time"));

// Store in session
session.setAttribute("user", name);

// Set custom expiry time
session.setMaxInactiveInterval(time);
%>

<h2>Hello <%= name %>!</h2>

<p>Session expiry time set to <%= time %> seconds.</p>

<p>
Click below within the time or wait to see expiry:
</p>

<a href="second.jsp">Check Session</a>

</body>
</html>