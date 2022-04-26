package creational_dp_hmw.singleton_dp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectionService {

    private static DatabaseConnectionService dcService;

    private DatabaseConnectionService() {

    }

    public static Connection createConnection() {
        final String DATABASE_URL =
                "jdbc:mysql://localhost:3306/airport_management_system";
        final String USERNAME = "root";
        final String PASSWORD = "root";

        Connection conn = null;

        try {

            return conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static DatabaseConnectionService getDbConnection() {

        return dcService = new DatabaseConnectionService();
    }

}
