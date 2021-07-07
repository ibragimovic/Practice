package TaskB.Models;

public class Country {
    private int countryId;
    private String countryName;
    private Integer countryPopulation;
    private People president;

    @Override
    public String toString() {
        return "\nCountry ID: " + countryId + ", Name: " + countryName + ", Population: " + countryPopulation + ", President: " + president;
    }

    public Country() {
    }

    public Country(int countryId, String countryName, Integer countryPopulation, People president) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
        this.president = president;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(Integer countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public People getPresident() {
        return president;
    }

    public void setPresident(People president) {
        this.president = president;
    }
}
