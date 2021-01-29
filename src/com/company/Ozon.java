package com.company;

public class Ozon extends OnlineStrore{

    private Products[] products;

    public Ozon(){
        super(20.0, 5, 5, 20);
        this.products = getProducts();
    }

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }
}
