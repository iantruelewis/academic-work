package tags;

import model.UserData;
import java.sql.*;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;

public class SaveUser extends SimpleTagSupport {
    public void doTag() throws JspException {
        try {
            PageContext pc = (PageContext) getJspContext();
            UserData user = (UserData) pc.getAttribute("userData");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "root", "password");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (firstName, lastName, email, phone, gender, dob, country, profession) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getGender());
            ps.setString(6, user.getDob());
            ps.setString(7, user.getCountry());
            ps.setString(8, user.getProfession());

            ps.executeUpdate();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            JspWriter out = pc.getOut();
            out.println("<h3>All Users:</h3><table border='1'>");
            while (rs.next()) {
                out.println("<tr><td>" + rs.getString("firstName") + "</td><td>" + rs.getString("lastName") + "</td><td>" + rs.getString("email") + "</td></tr>");
            }
            out.println("</table>");

            ps.close(); conn.close();
        } catch (Exception e) {
            throw new JspException("Error: " + e.getMessage());
        }
    }
}