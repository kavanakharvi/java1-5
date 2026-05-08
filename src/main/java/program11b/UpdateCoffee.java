package program11b;
import java.sql.*;

public class UpdateCoffee {

    public static void main(String[] args) {

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "student");

            // Display Existing Records
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM coffee");

            System.out.println("Existing Coffee Records");

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                      + rs.getString("coffee_name") + " "
                      + rs.getInt("price"));
            }

            // Update Coffee Record
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE coffee SET price=? WHERE id=?");

            ps.setInt(1, 250);
            ps.setInt(2, 2);

            int x = ps.executeUpdate();

            if(x > 0) {
                System.out.println("Coffee Record Updated Successfully");
            } else {
                System.out.println("Record Not Found");
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);

        }
    }
}