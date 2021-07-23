package com.learning.buildingrelationswithjdbc;

import java.sql.*;

public class DBConnection {

    public static void getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "pluralsight";
        String query = "SELECT * FROM GAME_REVIEW.game";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                String row = "";
                row += "Title: " + result.getString("title") + "\nRating: " + result.getInt("rating");
                System.out.println(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
