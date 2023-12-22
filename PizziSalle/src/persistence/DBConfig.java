package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    private static final String DATABASE_URL = "jdbc:sqlite:pizzisalle_database.db";
    private static DBConfig instance;

    private DBConfig() {
        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");
            // Establish a connection to the database
            DriverManager.getConnection(DATABASE_URL);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately in a real-world application
        }
    }

    public static DBConfig getInstance() {
        if (instance == null) {
            instance = new DBConfig();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL);
    }

    // Other methods for database configuration, if needed
}