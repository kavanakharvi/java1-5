package prog12b;

import java.sql.*;

public class QueryCoffee {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "student");

            PreparedStatement ps =
                    con.prepareStatement(
                    "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'");

            ResultSet rs = ps.executeQuery();

            System.out.println("Coffee Names Starting With D");

            while(rs.next()) {

                System.out.println(
                        rs.getInt(1) + " "
                      + rs.getString(2) + " "
                      + rs.getInt(3));
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }
}