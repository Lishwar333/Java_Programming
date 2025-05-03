package jdbcPractice;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; // Replace with your DB details
        String user = "root";
        String password = "password";

        try {
            // Load and register JDBC driver (optional in modern versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create statement
            Statement stmt = conn.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM sev_model_details");

            // Process result
            while (rs.next()) {
                System.out.println("Model ID: " + rs.getString("MODEL_ID"));
                System.out.println("Model Statue: " + rs.getString("MODEL_STATUS"));
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
