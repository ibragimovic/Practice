package TaskA;

import java.sql.*;

public class DbConnector {
    private final static String url = "jdbc:postgresql://localhost:5432/homework37";
    private final static String DRIVER = "org.postgresql.Driver";
    private final static String user = "postgres";
    private final static String password = "4342";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}
