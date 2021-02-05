package com.company;

public abstract class AbstractLocality {

    private String name;
    private String headLocality;
    private double areaSquareKm;
    double populationTsnd;

    public abstract String searchHeadLocality();

    public AbstractLocality() {
    }

    public AbstractLocality(String name, String headLocality, double areaSquareKm, double populationTsnd) {
        this.name = name;
        this.headLocality = headLocality;
        this.areaSquareKm = areaSquareKm;
        this.populationTsnd = populationTsnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadLocality() {
        return headLocality;
    }

    public void setHeadLocality(String headLocality) {
        this.headLocality = headLocality;
    }

    public double getAreaSquareKm() {
        return areaSquareKm;
    }

    public void setAreaSquareKm(double areaSquareKm) {
        this.areaSquareKm = areaSquareKm;
    }

    public double getPopulationTsnd() {
        return populationTsnd;
    }

    public void setPopulationTsnd(double populationTsnd) {
        this.populationTsnd = populationTsnd;
    }
}
