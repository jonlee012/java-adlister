import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );
        String selectQuery = "SELECT * FROM albums";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);
// 'rs' is an instance of ResultSet
        while (rs.next()) {
            System.out.println("Here's an album:");
            System.out.println("id : " + rs.getLong("id"));
            System.out.println("artist : " + rs.getString("artist"));
            System.out.println("name : " + rs.getString("name"));

            // do something with each row
        }
    }
}
