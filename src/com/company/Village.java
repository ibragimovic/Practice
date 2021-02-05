package com.company;

public class Village extends AbstractLocality{
    public Village() {
    }

    public Village(String name, String headLocality, double areaSquareKm, double populationTsnd) {
        super(name, headLocality, areaSquareKm, populationTsnd);
    }

    @Override
    public String searchHeadLocality() {
        return getName();

    }
}
