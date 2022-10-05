package com.company;

import java.sql.*;
import java.util.Random;


public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/shop";
    static final String USER = "root";
    static final String PASS = "2005";
    static final String Query = "INSERT INTO product(name, qty, price) VALUES('Me', 32, 17.08);";
    static final String Query2 = "ALTER TABLE product AUTO_iNCREMENT = 18";

    public static void main(String[] args) {

        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

                PreparedStatement statement = conn.prepareStatement(Query);) {
            Random rand = new Random();
            statement.executeUpdate();

            // for (int i = 0; i < 200; i++) {
            // statement.setString(1, "Product "+(i + 1));
            // statement.setInt(2, (rand.nextInt(100 - 4) + 4));
            // statement.setDouble(3, (rand.nextInt(2000 - 1000) + 1000));
            // int rows = statement.executeUpdate();
            // }
            System.out.println("Rows have been inserteed.");
            // Statement stmt = conn.createStatement();
            // ResultSet rs = stmt.executeQuery(Query);) {
            // // Extract data from result set
            // while (rs.next()) {
            // // Retrieve by column name
            // System.out.println("ID: " + rs.getInt("id"));
            // }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}