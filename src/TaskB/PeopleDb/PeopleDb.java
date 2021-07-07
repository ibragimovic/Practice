package TaskB.PeopleDb;

import TaskB.DbConnector.DbConnector;
import TaskB.Models.People;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PeopleDb {
    public static void insertPeople(People people) {
        String sql = "insert into people (first_name, last_name, date_of_birth) values(?, ?, ?)";

        try(Connection connection = new DbConnector().connect();
            PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, people.getFirstName());
            statement.setString(2, people.getLastName());
            statement.setString(3, people.getDateOfBirth());
            statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
