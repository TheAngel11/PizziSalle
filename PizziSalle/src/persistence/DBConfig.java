package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * PATTERN: Singleton
 * El patron de diseño singleton es un patron creacional que garantiza que una clase solo tenga una instancia,
 * y proporciona un punto de acceso global a ella.
 * En este caso, el patron singleton se utiliza para crear una unica instancia de la clase DBConfig, que es la
 * encargada de gestionar la conexion con la base de datos. De esta manera, se garantiza que solo haya una conexion
 * con la base de datos.
 * En nuestro caso, la clase DBConfig se encarga de hacer la conexion con la base de datos, pero es privada, y solo
 * se puede acceder a ella a traves del metodo getInstance(), que devuelve la instancia de la clase DBConfig.
 * La clase CustomerSQL es la unica que accede a la clase DBConfig, ya que de momento solo se guardan los clientes,
 * pero si en un futuro se quisiera guardar otros datos, tambien harian uso de este Singleton.
 */
public class DBConfig {
    private static final String DATABASE_URL = "jdbc:sqlite:pizzisalle_database.db";
    private static DBConfig instance;

    private DBConfig() {
        try {
            Class.forName("org.sqlite.JDBC");
            DriverManager.getConnection(DATABASE_URL);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
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
}