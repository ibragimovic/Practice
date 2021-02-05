package com.company;

import java.util.Scanner;

public class City extends AbstractLocality{

    AbstractLocality[] districts;

    public City() {
    }

    public City(String name, String headLocality, double areaSquareKm, double populationTsnd, AbstractLocality [] districts) {
        super(name, headLocality, areaSquareKm, populationTsnd);
        this.districts = districts;
    }

    @Override
    public String searchHeadLocality() {
        return getName();
    }

    public String searchHeadDistrict(AbstractLocality[] districts){
        String messasge = null;
        for(AbstractLocality district : districts){
            messasge += district.searchHeadLocality();
            System.out.println();
        }
        return messasge;
    }

}
