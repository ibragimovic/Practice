package com.company.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDb {

    public void StudentDb() {
        countStudents();
    }

    private void countStudents() {

        String sql = "SELECT COUNT(id) from student";
        int count = 0;

        try(Connection conn = new DataBase().connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            rs.next();
            count = rs.getInt("count");
            System.out.println("В группе " + count + " студентов.");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();

    }
}
