package cz.educanet;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/games", "root", "");

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM games");


        while(result.next()) {
            int id = result.getInt("id");
            String studio = result.getString("studio");
            String game = result.getString("game");
            System.out.println(id + "\t" + studio + "\t" + game + "\t");


        }

        connection.close();
    }
}
