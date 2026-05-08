<%@ page import="java.sql.*" %>

<%

int eno = Integer.parseInt(request.getParameter("eno"));
String ename = request.getParameter("ename");
int salary = Integer.parseInt(request.getParameter("salary"));

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/Employee",
"root",
"student");

PreparedStatement ps =
con.prepareStatement(
"INSERT INTO Emp VALUES(?,?,?)");

ps.setInt(1, eno);
ps.setString(2, ename);
ps.setInt(3, salary);

ps.executeUpdate();

Statement st = con.createStatement();

ResultSet rs = st.executeQuery("SELECT * FROM Emp");

int total = 0;

out.println("<h2>Salary Report</h2>");

while(rs.next()) {

out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

out.println("Emp_No : " + rs.getInt(1) + "<br>");

out.println("Emp_Name : " + rs.getString(2) + "<br>");

out.println("Basic : " + rs.getInt(3) + "<br>");

total = total + rs.getInt(3);
}

out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

out.println("Grand Salary : " + total);

con.close();

%>