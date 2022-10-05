import java.sql.*;

public class app {
    static final String DB_URL = "jdbc:mysql://localhost/experience";
    static final String USER = "root";
    static final String PASS = "2005";
    static final String QUERY = "CREATE TABLE persons(PersonId int," +
            " LastName varchar(255)," +
            " FirstName varchar(255)," +
            " Address varchar(255)," +
            " City varchar(255))";
    static final String QUERY1 = "SELECT * FROM Persons";
    static final String QUERY2 = "ALTER TABLE Persons ADD PRIMARY KEY(PersonId)";
    static final String QUERY3 = "ALTER TABLE Persons CHANGE COLUMN `PersonId` `PersonId` INT NOT NULL AUTO_INCREMENT";
    static final String QUERY4 = "INSERT INTO Persons (LastName, FirstName, Address, City) values(?, ?, ?, ?)";
    static final String QUERY5 = "SELECT * FROM Persons WHERE PersonId = 2";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY5);

//             PreparedStatement statement = conn.prepareStatement(QUERY4);

             ){
//            statement.setString(1, "Karimbayev");
//            statement.setString(2, "Abdulazizxon");
//            statement.setString(3, "Obod M.F.Y");
//            statement.setString(4, "Namangan");
//            statement.executeUpdate();

            while (rs.next()){
                System.out.print("PersonId: " + rs.getInt("PersonId"));
                System.out.print("PersonName: " + rs.getString("FirstName"));

            }

//            System.out.println("Table Created.");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
