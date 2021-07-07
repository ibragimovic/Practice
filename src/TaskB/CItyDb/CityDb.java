package TaskB.CItyDb;

import TaskB.DbConnector.DbConnector;
import TaskB.Models.City;
import TaskB.Models.Country;
import TaskB.Models.People;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDb {

    public static void insertCity(City city) {
        String sql = "insert into city(name, country_id, mayor, population) values(?, ?, ?, ?)";

        try(Connection connection = new DbConnector().connect();
            PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, city.getCityName());
            statement.setInt(2, city.getCountryId().getCountryId());
            statement.setInt(3, city.getMayor().getPeopleId());
            statement.setInt(4, city.getPopulation());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<City> addToArrayListFromDb() {
        String sql = "select * from city \n" +
                    "join people on city.mayor =  people.people_id;";
        List<City> cities = new ArrayList<>();
        Country country = null;

        try(Connection connection = new DbConnector().connect();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql)) {

            while (rs.next()) {
                People people = new People(rs.getInt("people_id"), rs.getString("first_name"),
                            rs.getString("last_name"), rs.getString("date_of_birth"));
                City city =new City(rs.getInt("city_id"), rs.getString("name"), country, people, rs.getInt("population"));

                cities.add(city);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cities;

    }

}
