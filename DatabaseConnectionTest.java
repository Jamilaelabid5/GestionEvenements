import java.sql.*;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        try {
            // Test the connection to the database
            Connection conn = DBConnection.getConnection();  // Use DBConnection.getConnection()
            if (conn != null) {
                System.out.println("Connection successful!");
            }
            conn.close(); // Close the connection after testing
        } catch (SQLException e) {
            // Handle exceptions if the connection fails
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
