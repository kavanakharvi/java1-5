<%@ page language="java" %>
<html>
<body>

<%
String name = (String) session.getAttribute("user");

if(name == null){
%>
    <h3 style="color:red;">Session expired!</h3>
<%
}else{
%>
    <h3>Hello <%= name %>!</h3>
<%
}
%>

</body>
</html>