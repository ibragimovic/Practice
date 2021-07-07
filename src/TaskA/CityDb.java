package TaskA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CityDb {
    public static void insertCities(List<City> cities) {
        String SQL = "insert into city (id, name) values(?, ?)";

        try (Connection connection = new DbConnector().connect();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            for (City city : cities) {
                preparedStatement.setInt(1, city.getId());//внесения данных для первого ?
                preparedStatement.setString(2, city.getName());//внесения данных для второго ?
                preparedStatement.execute();//выполнение запроса
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean hasCityById(int id) {
        String sql = "select * from city where id = ?";

        try (Connection connection = new DbConnector().connect();
             PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            int counter = 0;
            while (resultSet.next()) {
                counter++;
            }
            return counter > 0;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static void insertCity(City city) {
        String insertSQL = "insert into city (id, name) values(?, ?)";

        try(Connection connection = new DbConnector().connect();
            PreparedStatement stmt = connection.prepareStatement(insertSQL)){
            stmt.setInt(1, city.getId());
            stmt.setString(2, city.getName());
            stmt.execute();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void updateCity(City city) {
        String updateSQL = "update city set name = ? where id = ?";
        try(Connection conn = new DbConnector().connect();
            PreparedStatement stmt = conn.prepareStatement(updateSQL)) {
            stmt.setString(1, city.getName());
            stmt.setInt(2, city.getId());
            stmt.execute();

        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void insertOrUpdateCity(List<City> cities) {

        for (City city : cities) {
            boolean hasCity = hasCityById(city.getId());

            try (Connection connection = new DbConnector().connect()) {

                if (hasCity) {
                    CityDb.updateCity(city);
                } else {
                    CityDb.insertCity(city);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }





    }
}
