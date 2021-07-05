package com.company.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GroupDB {
    public void GroupDB() {
        getGroups();
    }

    private void getGroups() {
        String sql = "SELECT * FROM group_student";

        try(Connection conn = new DataBase().connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);){

            while (rs.next())
                System.out.println(rs.getInt("id") + " " + rs.getString("student_full_name"));
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
