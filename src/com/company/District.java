package com.company;

public class District extends AbstractLocality {

    public District() {
    }

    public District(String name, String headLocality, double areaSquareKm, double populationTsnd) {
        super(name, headLocality, areaSquareKm, populationTsnd);
    }

    @Override
    public String searchHeadLocality() {
        return getName();
    }

}
