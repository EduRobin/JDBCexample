package cz.educanet;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/zoo", "root", "");

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT DISTINCT Z.jmeno, D.nazev FROM Zvirata Z JOIN Druhy D ON D.id = Z.druh");


        while(result.next()) {
            String jmeno = result.getString("jmeno");
            String nazev = result.getString("nazev");
            System.out.println(jmeno + "\t" + nazev + "\t");


        }

        connection.close();
    }
}
