package com.company;

public class Food {
    int price;
    String countryProducer;
    int salesTaxPercentage;

    public Food(){}

    public Food(int price, String countryProducer, int salesTaxPercentage) {
        this.price = price;
        this.countryProducer = countryProducer;
        this.salesTaxPercentage = salesTaxPercentage;
    }

    @Override
    public String toString(){

        return "Food\nprice - " + price + ", country of the producer - " + countryProducer + ", sales tax (percentage) - " + salesTaxPercentage + "\n";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountryProducer() {
        return countryProducer;
    }

    public void setCountryProducer(String countryProducer) {
        this.countryProducer = countryProducer;
    }

    public int getSalesTaxPercentage() {
        return salesTaxPercentage;
    }

    public void setSalesTaxPercentage(int salesTaxPercentage) {
        this.salesTaxPercentage = salesTaxPercentage;
    }
}
