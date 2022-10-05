import java.sql.*;

public class app {
    static final String DB_URL = "jdbc:mysql://localhost/shop";
    static final String USER = "root";
    static final String PASS = "2005";
    static final String QUERY = " ";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            ) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}