package com.company.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainersDb {

    public void TrainersDb() {
        getTrainers();
        getTotalSalary();
        checkTrainersFullName();
    }

    private void getTrainers() {
        String sql = "SELECT trainer.trainer_full_name, sport_type.salary " +
                "FROM trainer JOIN sport_type ON sport_type.id = trainer.sport_type;";
        try(Connection conn = new DataBase().connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()) {
                System.out.println(rs.getString("trainer_full_name") + " - " + rs.getInt("salary") + " som");
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }

    private void getTotalSalary() {
        String sql = "SELECT SUM(sport_type.salary) FROM trainer JOIN sport_type ON sport_type.id = trainer.sport_type;";

        int total = 0;
        try(Connection conn = new DataBase().connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            rs.next();
            total = rs.getInt("sum");
            System.out.println("Total salary: " + total);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }

    private void checkTrainersFullName(){
        String sql = "SELECT trainer_full_name FROM trainer;";

        try(Connection conn = new DataBase().connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                if (rs.getString("trainer_full_name").length() > 3) {
                    System.out.println(rs.getString("trainer_full_name") + " молодец.");
                } else {
                    System.out.println(rs.getString("trainer_full_name") + " не молодец!");
                }
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }



}
