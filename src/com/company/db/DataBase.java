package com.company.db;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
    private final static String url = "jdbc:postgresql://localhost:5432/homework37";
    private final static String DRIVER = "org.postgresql.Driver";
    private final static String user = "postgres";
    private final static String password = "4342";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}

//    public static Connection connect(){
//        try {
//            Class.forName(DRIVER);
//            try {
//                CON = DriverManager.getConnection(url, user, password);
//                System.out.println("Connected to PostgreSQL server");
//            } catch (SQLException ex) {
//                System.out.println(ex.getMessage());
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        return CON;
//    }
//
//    public void showTrainers() {
//        String SQL = "select * from trainers";
//
//        try (Connection conn = connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(SQL)) {
//
//            while(rs.next()) {
//                System.out.println(rs.getString("trainer_full_name"));
//                System.out.println(rs.getString("sport_type_id"));
//            }
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

