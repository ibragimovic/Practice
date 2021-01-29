package com.company;

public class Products {
    private String nameProducts;
    private double weightProduct;
    private int priceProducts;

    public Products() {}

    public Products(String nameProducts, double weightProduct, int priceProducts) {
        this.nameProducts = nameProducts;
        this.weightProduct = weightProduct;
        this.priceProducts = priceProducts;
    }

    @Override
    public String toString(){
        return "Product\nname - " + getNameProducts() + ", weight - " + getWeightProduct() + ", price - " + getPriceProducts();
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public double getWeightProduct() {
        return weightProduct;
    }

    public void setWeightProduct(double weightProduct) {
        if (weightProduct > 0)
            this.weightProduct = weightProduct;
    }

    public int getPriceProducts() {
        return priceProducts;
    }

    public void setPriceProducts(int priceProducts) {
        if (priceProducts > 0)
            this.priceProducts = priceProducts;
    }
}
