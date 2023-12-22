package persistence;

import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerSQL {


    public void saveCustomer(Customer customer) {
        String query = "INSERT INTO customers (name, surname1, surname2, phone, address, isFirstOrder, delegation) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DBConfig.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getSurname1());
            preparedStatement.setString(3, customer.getSurname2());
            preparedStatement.setInt(4, customer.getPhone());
            preparedStatement.setString(5, customer.getAddress());
            preparedStatement.setBoolean(6, customer.isFirstOrder());
            preparedStatement.setString(7, customer.getDelegation());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately in a real-world application
        }
    }

    public void createCustomersTable() {
        String query = "CREATE TABLE IF NOT EXISTS customers (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name TEXT NOT NULL," +
            "surname1 TEXT NOT NULL," +
            "surname2 TEXT NOT NULL," +
            "phone INTEGER NOT NULL," +
            "address TEXT NOT NULL," +
            "isFirstOrder BOOLEAN NOT NULL," +
            "delegation TEXT NOT NULL" +
            ");";

        try (Connection connection = DBConfig.getInstance().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}