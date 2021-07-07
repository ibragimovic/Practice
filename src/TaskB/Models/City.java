package TaskB.Models;

public class City {
    private Integer cityId;
    private String cityName;
    private Country countryId;
    private People mayor;
    private int population;

    @Override
    public String toString() {
        return "\nCity ID: " + cityId + ", City name: " + cityName + ", Mayor: " + mayor + ", population: " + population;
    }

    public City() {
    }

    public City(Integer cityId, String cityName, Country countryId, People mayor, int population) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.countryId = countryId;
        this.mayor = mayor;
        this.population = population;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    public People getMayor() {
        return mayor;
    }

    public void setMayor(People mayor) {
        this.mayor = mayor;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
