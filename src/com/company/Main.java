package com.company;

import com.company.db.DataBase;
import com.company.db.GroupDB;
import com.company.db.StudentDb;
import com.company.db.TrainersDb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        new GroupDB().GroupDB();
        new StudentDb().StudentDb();
        new TrainersDb().TrainersDb();
    }
}
