package oop.step2.lesson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WorkerConnect {
    private final String HOST  = "jdbc:mysql://localhost/mysql?verifyServerCertificate=true&useSSL=true";
    private final String ADMINUSER = "root";
    private final String ADMINPASS = "root";
    private Connection connection;

    public WorkerConnect() {
        try {
            this.connection = DriverManager.getConnection(HOST,ADMINUSER,ADMINPASS);
        }catch (SQLException ex) {
            System.err.println("Іди нахуй, шкіряний чоловіче");
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
