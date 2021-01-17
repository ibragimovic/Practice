package com.company;

public class Dairy extends Food {
    String typeDairy;
    String name;
    int shelfLife;
    double litter;

    public Dairy() {}

    public Dairy(int price, String countryProducer, int salesTaxPercentage, String typeDairy, String name, int shelfLife, double litter) {
        super(price, countryProducer, salesTaxPercentage);
        this.typeDairy = typeDairy;
        this.name = name;
        this.shelfLife = shelfLife;
        this.litter = litter;
    }

    @Override
    public String toString(){

        return "Dairy products\nprice - " + price + ", country of the producer - " + countryProducer + ", sales tax (percentage) - " + salesTaxPercentage
                + "\ntype - " + typeDairy + ", name - " + name + ", shelf life - " + shelfLife + ", litters - " + litter;
    }

    public String getTypeDairy() {
        return typeDairy;
    }

    public void setTypeDairy(String typeDairy) {
        this.typeDairy = typeDairy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getLitter() {
        return litter;
    }

    public void setLitter(double litter) {
        this.litter = litter;
    }
}
