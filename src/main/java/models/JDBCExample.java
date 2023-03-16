package models;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            // register driver
            DriverManager.registerDriver(new Driver());

            // make the connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            // create a statement

            Statement stmt = connection.createStatement();

            // run query with statement and parse result set

            String query = "select * from albums;";

            ResultSet rs = stmt.executeQuery(query);

//            rs.next();

            while(rs.next()){
                String artist = rs.getString("artist");
                    if(artist.equals("Pink Floyd")){
                        System.out.println(rs.getString("name"));
                    }
                }


//            System.out.println(rs.getString("artist"));


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
