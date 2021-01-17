package com.company;

public class FlourProducts extends Food {
    String typeFlourProducts;
    String production;
    double weight;

    public FlourProducts() {}

    public FlourProducts(int price, String countryProducer, int salesTaxPercentage, String typeFlourProducts, String production, double weight) {
        super(price, countryProducer, salesTaxPercentage);
        this.typeFlourProducts = typeFlourProducts;
        this.production = production;
        this.weight = weight;
    }

    @Override
    public String toString(){

        return "Flour products\nprice - " + price + ", country of the producer - " + countryProducer + ", sales tax (percentage) - " + salesTaxPercentage
                + "\ntype - " + typeFlourProducts + ", production - " + production + ", weight - " + weight + "\n";
    }

    public String getTypeFlourProducts() {
        return typeFlourProducts;
    }

    public void setTypeFlourProducts(String typeFlourProducts) {
        this.typeFlourProducts = typeFlourProducts;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
