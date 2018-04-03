package oop.step1.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/mysql?verifyServerCertificate=true&useSSL=true";
        String name = "root";
        String password = "root";
        Connection connection = null;
        //TODO: What DOES the FUCK SAY??~~~~
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, name, password);
            System.out.println("Hello");
            connection.close();
            System.out.println("berry");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
