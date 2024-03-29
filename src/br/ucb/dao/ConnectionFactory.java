package br.ucb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/banco", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
