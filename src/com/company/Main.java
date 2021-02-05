package com.company;

public class Main {

    public static void main(String[] args) {

        AbstractLocality pervomaiskii = new District("Первомайский район", "Алибек Биримкулов", 39, 175.9);
        AbstractLocality sverdlovskii = new District("Свердловский район", "Самарбек Болотбеков", 46, 181.6);
        AbstractLocality leninskii = new District("Ленинский район", " Нурдин Тынаев", 51, 150.4);
        AbstractLocality oktyabrskii = new District("Октябрьский район", "Ренат Айтымбетов", 58, 189.7);

        AbstractLocality [] districts = {pervomaiskii, sverdlovskii, leninskii, oktyabrskii};

        AbstractLocality Bishkek = new City("Bishkek", "Tulobaev Balbak", 160.0, 1053.9, districts);


        System.out.println(Bishkek.searchHeadLocality());



    }
}
