package program12a;

import java.sql.*;

public class DeleteCoffee {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "student");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT * FROM coffee");

            System.out.println("Existing Records");

            while(rs.next()) {

                System.out.println(
                        rs.getInt(1) + " "
                      + rs.getString(2) + " "
                      + rs.getInt(3));
            }

            PreparedStatement ps =
                    con.prepareStatement(
                    "DELETE FROM coffee WHERE id=?");

            ps.setInt(1, 2);

            int x = ps.executeUpdate();

            if(x > 0) {
                System.out.println("Coffee Record Deleted");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}