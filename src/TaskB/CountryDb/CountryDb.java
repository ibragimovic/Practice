package TaskB.CountryDb;

import TaskB.DbConnector.DbConnector;
import TaskB.Models.Country;
import TaskB.Models.People;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDb {
    public static void insertCountry(Country country) {
        String sql = "insert into country (name, population, president) values(?, ?, ?)";

        try (Connection connection = new DbConnector().connect();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, country.getCountryName());
            stmt.setInt(2, country.getCountryPopulation());
            stmt.setInt(3, country.getPresident().getPeopleId());
            stmt.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Country> addToArrayListFromDb() {
        String sql = "select * from country join people on country.president =  people.people_id;";
        List<Country> countries = new ArrayList<>();
        try(Connection connection = new DbConnector().connect();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {


            while (rs.next()) {
                People people = new People(rs.getInt("people_id"), rs.getString("first_name"),
                                rs.getString("last_name"), rs.getString("date_of_birth"));
                Country country = new Country(rs.getInt("country_id"), rs.getString("name"),
                                rs.getInt("population"), people);

                countries.add(country);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return countries;

    }
}
