package dao;

import com.mysql.cj.jdbc.Driver;
import models.Ad;
import models.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao() {

        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Ad> all() {
       List<Ad> ads = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");

            while(rs.next()) {
            Ad ad = new Ad(
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
            );
            ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long newAdId = null;
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO ads (user_id, title, description) VALUE (?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if(rs.next()){
                newAdId = rs.getLong(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return newAdId;
    }
}
