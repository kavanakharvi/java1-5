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
"UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_NO=?");

ps.setString(1, ename);
ps.setInt(2, salary);
ps.setInt(3, eno);

int x = ps.executeUpdate();

if(x > 0)
{
    out.println("<h2>Employee Record Updated Successfully</h2>");
}
else
{
    out.println("<h2>Record Not Found</h2>");
}

Statement st = con.createStatement();

ResultSet rs = st.executeQuery("SELECT * FROM Emp");

out.println("<h2>Updated Employee Records</h2>");

while(rs.next())
{
    out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

    out.println("Emp_No : " + rs.getInt(1) + "<br>");

    out.println("Emp_Name : " + rs.getString(2) + "<br>");

    out.println("Basic Salary : " + rs.getInt(3) + "<br>");
}

con.close();

%>