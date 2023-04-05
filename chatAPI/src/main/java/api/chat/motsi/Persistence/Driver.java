package api.chat.motsi.Persistence;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class Driver {

    Connection connection;
    private Driver(String password) throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatAPIdb","root", password);
    }

    public static void main(String[] args) {

        try {
            System.out.print("Please enter the password to connect to the SQL server: ");
            Driver driver = new Driver(new Scanner(System.in).nextLine());
            System.out.println("Success!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
