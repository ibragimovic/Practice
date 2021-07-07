package TaskB;

import TaskB.CItyDb.CityDb;
import TaskB.CountryDb.CountryDb;
import TaskB.Models.City;
import TaskB.Models.Country;
import TaskB.Models.People;
import TaskB.PeopleDb.PeopleDb;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        People people = new People(1, "Ibragim", "Musaev", "03.12.1988");
        People people1 = new People(2, "Nargiza", "Musaeva", "17.08.1990");
        People people2 = new People(3, "Meerim", "Ruslan kyzy", "02.06.1990");
        People people3 = new People(4, "Leila", "Valieva", "20.02.1962");
        People people4 = new People(5, "Aruujan", "Abubakirova", "28.08.2018");
        People people5 = new People(6, "Amir", "Seitaliev", "30.04.2015");
        People people6 = new People(7, "Talgat", "Seitaliev", "15.01.2014");
        People people7 = new People(8, "Jenish", "Seitaliev", "09.05.1989");
        People people8 = new People(9, "Samat", "Musaev", "13.02.1993");
        People people9 = new People(10, "Kanat", "Mambetov", "31.07.1988");
        People people10 = new People(11, "Mirlan", "Duishenbaev", "17.05.1987");
        People people11 = new People(12, "Jyrgal", "Kolbaev", "12.02.1989");

//        PeopleDb.insertPeople(people);
//        PeopleDb.insertPeople(people1);
//        PeopleDb.insertPeople(people2);
//        PeopleDb.insertPeople(people3);
//        PeopleDb.insertPeople(people4);
//        PeopleDb.insertPeople(people5);
//        PeopleDb.insertPeople(people6);
//        PeopleDb.insertPeople(people7);
//        PeopleDb.insertPeople(people8);
//        PeopleDb.insertPeople(people9);
//        PeopleDb.insertPeople(people10);
//        PeopleDb.insertPeople(people11);

        Country country = new Country(1, "Kyrgyzstan", 6500000, people4);
        Country country1 = new Country(2, "USA", 268000553, people6);
        Country country2 = new Country(3, "Germany", 215698745, people5);

//        CountryDb.insertCountry(country);
//        CountryDb.insertCountry(country1);
//        CountryDb.insertCountry(country2);


        City city = new City(1, "Bishkek", country, people1, 1500000);
        City city1 = new City(2, "New-York", country1, people, 35000568);
        City city2 = new City(3, "Munich", country2, people2, 25365214);

//        CityDb.insertCity(city);
//        CityDb.insertCity(city1);
//        CityDb.insertCity(city2);

        List<Country> countries = CountryDb.addToArrayListFromDb();
        System.out.println(countries);

        List<City> cities = CityDb.addToArrayListFromDb();
        System.out.println(cities);


    }
}
