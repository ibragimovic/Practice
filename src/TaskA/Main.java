package TaskA;

import TaskA.City;
import TaskA.CityDb;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<City> cities = new ArrayList<>();
        cities.add(new City(1, "Pishkek"));
        cities.add(new City(2, "Osh"));
        cities.add(new City(3, "Karakol"));
        cities.add(new City(4, "Batken"));
        cities.add(new City(5, "Kant"));
//        CityDb.insertCities(cities);

        List<City> cities2 = new ArrayList<>();
        cities2.add(new City(1, "Bishkek"));
        cities2.add(new City(6, "Talas"));
        cities2.add(new City(7, "Naryn"));
        cities2.add(new City(3, "Cholpon-Ata"));
        cities2.add(new City(5, "Tokmok"));
        CityDb.insertOrUpdateCity(cities2);

    }

}
