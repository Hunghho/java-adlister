package models;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCEmployees {



    public static void main(String[] args) {
        List<String> nameArray = new ArrayList<>();
        // register driver
        try {
            DriverManager.registerDriver(new Driver());

            // make the connection

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );

            // create a statement

            Statement stmt = connection.createStatement();

            // run query with statement and parse result set

            String query = "SELECT * FROM employees LIMIT 10;";

            ResultSet rs = stmt.executeQuery(query);

//            rs.next();
//            System.out.println(rs.getString("first_name"));
            while(rs.next()){
//                System.out.println(rs.getString("first_name") + " " + rs.getString("last_name"));
               nameArray.add(rs.getString("first_name") + " " + rs.getString("last_name"));
            }
            System.out.println(nameArray);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
