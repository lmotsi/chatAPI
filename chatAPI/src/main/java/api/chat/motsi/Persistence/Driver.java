package api.chat.motsi.Persistence;

import java.sql.*;

public class Driver {

    Connection connection;
    private Driver() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chatAPIdb");
    }

    public static void main(String[] args) {

        try {
            Driver driver = new Driver();
            System.out.println("Success!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
