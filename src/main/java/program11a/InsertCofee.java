package program11a;
import java.sql.*;

public class InsertCofee {

    public static void main(String[] args) {

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "student");

            // Display existing records
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM coffee");

            System.out.println("Existing Records");

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                      + rs.getString("coffee_name") + " "
                      + rs.getInt("price"));
            }

            // Insert new coffee
            PreparedStatement ps =
                    con.prepareStatement(
                    "INSERT INTO coffee VALUES(?,?,?)");

            ps.setInt(1, 4);
            ps.setString(2, "Mocha");
            ps.setInt(3, 200);

            int x = ps.executeUpdate();

            if(x > 0) {
                System.out.println("Coffee Inserted Successfully");
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}