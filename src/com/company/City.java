package com.company;

import java.util.Scanner;

public class City extends AbstractLocality{

    public City(String name, String headLocality, double areaSquareKm, double populationTsnd) {
        super(name, headLocality, areaSquareKm, populationTsnd);
    }

    @Override
    public String searchHeadLocality() {
        Scanner sc = new Scanner(System.in);
        String headLocality = sc.nextLine();
        if (headLocality.equals(getHeadLocality())){
            return getName();
        }
        return null;
    }
}
