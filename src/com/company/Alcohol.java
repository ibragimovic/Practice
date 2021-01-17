package com.company;

public class Alcohol extends Food{
    String kindOfAlcohol;
    String name;
    int degreeAlcohol;
    double liters;

    public Alcohol(){}

    public Alcohol(int price, String countryProducer, int salesTaxPercentage, String kindOfAlcohol, String name, int degreeAlcohol, double liters) {
        super(price, countryProducer, salesTaxPercentage);
        this.kindOfAlcohol = kindOfAlcohol;
        this.name = name;
        this.degreeAlcohol = degreeAlcohol;
        this.liters = liters;
    }

    @Override
    public String toString(){

        return "Alcohol\nprice - " + price + ", country of the producer - " + countryProducer + ", sales tax (percentage) - " + salesTaxPercentage
                + "\ntype - " + kindOfAlcohol + ", name - " + name + ", degree - " + degreeAlcohol + ", litters - " + liters;
    }

    public String getKindOfAlcohol() {
        return kindOfAlcohol;
    }

    public void setKindOfAlcohol(String kindOfAlcohol) {
        this.kindOfAlcohol = kindOfAlcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegreeAlcohol() {
        return degreeAlcohol;
    }

    public void setDegreeAlcohol(int degreeAlcohol) {
        this.degreeAlcohol = degreeAlcohol;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }
}
