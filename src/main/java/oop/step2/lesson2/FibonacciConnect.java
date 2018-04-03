package oop.step2.lesson2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FibonacciConnect {
    private final String HOST  = "jdbc:mysql://localhost/mysql?verifyServerCertificate=true&useSSL=true";
    private final String ADMINUSER = "root";
    private final String ADMINPASS = "root";
    private Connection connection;

    public FibonacciConnect() {
        try {
            this.connection = DriverManager.getConnection(HOST,ADMINUSER,ADMINPASS);
        }catch (SQLException ex) {
            System.err.println("Помилка у підключенні до бази даних");
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
