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

import java.net.URL;
import java.sql.*;

public class CreateTable {
    Connection con;
    Statement stmt;

    public CreateTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/databasedb?";
            con = DriverManager.getConnection(url + "user=student1&password=pass");
            stmt = con.createStatement();
        }
        catch(Exception e) {
            System.out.println("Error connection to database.");
            System.exit(0);
        }

        try {
            stmt.executeUpdate("DROP TABLE address");
            System.out.println("Table address Dropped");
        }
        catch(SQLException e) {
            System.out.println("Table address does not exist");
        }

        try {
            stmt.executeUpdate("CREATE TABLE address(ID int PRIMARY KEY,LASTNAME varchar(40)," +
                    "FIRSTNAME varchar(40), STREET varchar(40), CITY varchar(40), STATE varchar(40)," +
                    "ZIP varchar(40))");
            System.out.println("Table address Created");
        }
        catch(SQLException e) {
            System.out.println("Table address Creation failed");
        }

        try {
            stmt.close();
            con.close();
            System.out.println("Database connections closed");
        }
        catch(SQLException e) {
            System.out.println("Connection close failed");
        }
    }

    public static void main(String args[]) {
        CreateTable createTable = new CreateTable();
    }
}