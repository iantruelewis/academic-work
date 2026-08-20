// 02/23/25
// Ian Lewis
// CSD 420
// Module 9 Assignment

/*
    • For this assignment you are to ensure you have Java and NetBeans correctly installed and configured.
    • Then you are to correctly install and configure MySQL 5.
    • The following code example is to be used to test your setup.
        • Code Example for Testing Setup (Zip File) Click for more options
    • Your database name is to be "databasedb" user ID “student1” and the password for this account will be “pass”.
    • Lastly you are to configure the database to allow a Java connection.
    • Capture and submit images in a single document of your running of the test application to show you were successful with the installation and configuration.
*/

import java.sql.*;

public class Select5 {
    public static void main(String args[]) {
        try {
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/databasedb?";
            con = DriverManager.getConnection(url + "user=student1&password=pass");

            System.out.println("Connection established - now executing a select");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM address");

            System.out.println("Received Results:");

            int i = rs.getMetaData().getColumnCount();

            while(rs.next()) {
                for(int x = 1; x <= i; ++x) {
                    System.out.println(rs.getString(x));
                }
                System.out.println("");
            }

            stmt.close();
            con.close();
        }
        catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }
}